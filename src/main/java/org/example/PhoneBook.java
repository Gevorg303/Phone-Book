package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Users[] users;
    Map <String, String> user = new HashMap<String, String>();

    public void addUsers(String phoneNumber, String fullName)
    {
           phoneNumber = "1234567890";
           fullName = "Петя";
           user.put(phoneNumber, fullName);
    }
    public void  delUsers()
    {

    }
}
