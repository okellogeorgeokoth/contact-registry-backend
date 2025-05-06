package com.contactregistry.controllers;

import com.contactregistry.dao.ContactDAO;
import com.contactregistry.dao.ContactDAOImpl;
import com.contactregistry.models.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/contacts/*")
public class ContactApiServlet extends HttpServlet {
    private ContactDAO contactDAO;
    private ObjectMapper objectMapper;

    @Override
    public void init() {
        contactDAO = new ContactDAOImpl();
        objectMapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        String pathInfo = req.getPathInfo();
        resp.setContentType("application/json");
        
        if (pathInfo == null || pathInfo.equals("/")) {
            // Get all contacts
            List<Contact> contacts = contactDAO.getAllContacts();
            resp.getWriter().write(objectMapper.writeValueAsString(contacts));
        } else {
            // Get single contact by ID
            String[] parts = pathInfo.split("/");
            int id = Integer.parseInt(parts[1]);
            Contact contact = contactDAO.getContactById(id);
            resp.getWriter().write(objectMapper.writeValueAsString(contact));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Implement POST (create) logic
    }

    // Add PUT (update) and DELETE methods...
}