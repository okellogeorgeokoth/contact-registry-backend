package com.contactregistry.dao;

import com.contactregistry.models.Contact;
import java.util.List;

public interface ContactDAO {
    boolean addContact(Contact contact);
    Contact getContactById(int id);
    List<Contact> getAllContacts();
    boolean updateContact(Contact contact);
    boolean deleteContact(int id);
    List<Contact> getRecentContacts(int limit);
    List<Object[]> getContactsCountByGender();
    List<Object[]> getContactsCountByCounty();
}