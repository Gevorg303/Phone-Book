package org.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class UserInfo {
    public String uuid;
    String fullName;
    String organizationPhoneNumber;
    String phoneNumber;
    String userImage;
    String organization;
    String email;
    String address;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");


    public void UserInfo(String uuid, String fullName, String organization, String organizationPhoneNumber, String phoneNumber, String email, String address, Date dateNow) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.organization = organization;
        this.organizationPhoneNumber = organizationPhoneNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.dateNow = dateNow;

    }

    public void addUser() {

    }

    public void delUser(UserInfo userInfo) {

    }

    public void outputContact(UserInfo userInfo) {
        System.out.println(userInfo.uuid);
        System.out.println(userInfo.fullName);
        System.out.println(userInfo.organization);
        System.out.println(userInfo.organizationPhoneNumber);
        System.out.println(userInfo.phoneNumber);
        System.out.println(userInfo.email);
        System.out.println(userInfo.address);
    }
}
