package org.example;

public class UserInfo {
    String fullName;
    String organizationPhoneNumber;
    String phoneNumber;
    String organization;
    String email;
    String address;

    public UserInfo(String fullName, String phoneNumber, String email, String address, String organizationPhoneNumber, String organization) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.organizationPhoneNumber = organizationPhoneNumber;
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "\nИмя: " + fullName + ", Номер телефона: " + phoneNumber + ", Е-маил: " + email +
                ", Адрес: " + address + ", Номер организации: " + organizationPhoneNumber + ", Название организации: " + organization;
    }
}
