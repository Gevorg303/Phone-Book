package Telephone.phoneBook;

public class UserInfo {
    private final String fullName;
    private final String organizationPhoneNumber;
    private final String phoneNumber;
    private final String organization;
    private final  String email;
    private final String address;

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

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
