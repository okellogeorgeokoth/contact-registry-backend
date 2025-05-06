package com.contactregistry.dao;

import com.contactregistry.models.Contact;
import com.contactregistry.utils.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {
    
    @Override
    public boolean addContact(Contact contact) {
        String sql = "INSERT INTO contacts (full_name, phone_number, email, id_number, date_of_birth, gender, county) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, contact.getFullName());
            stmt.setString(2, contact.getPhoneNumber());
            stmt.setString(3, contact.getEmail());
            stmt.setString(4, contact.getIdNumber());
            stmt.setDate(5, new java.sql.Date(contact.getDateOfBirth().getTime()));
            stmt.setString(6, contact.getGender());
            stmt.setString(7, contact.getCounty());
            
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        String sql = "SELECT * FROM contacts ORDER BY created_at DESC";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Contact contact = mapResultSetToContact(rs);
                contacts.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    private Contact mapResultSetToContact(ResultSet rs) throws SQLException {
        Contact contact = new Contact();
        contact.setId(rs.getInt("id"));
        contact.setFullName(rs.getString("full_name"));
        contact.setPhoneNumber(rs.getString("phone_number"));
        contact.setEmail(rs.getString("email"));
        contact.setIdNumber(rs.getString("id_number"));
        contact.setDateOfBirth(rs.getDate("date_of_birth"));
        contact.setGender(rs.getString("gender"));
        contact.setCounty(rs.getString("county"));
        contact.setCreatedAt(rs.getTimestamp("created_at"));
        contact.setUpdatedAt(rs.getTimestamp("updated_at"));
        return contact;
    }

    // Implement other methods similarly...
}