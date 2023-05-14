package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class UserInfoHolder{
    List<UserInfo> userInfoList;
    public UserInfoHolder(){
        userInfoList= new ArrayList<>();
    }
    public void addContact(String fullName, String phoneNumber, String email, String address, String organizationPhoneNumber, String organization) {
        UserInfo newContact = new UserInfo(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
        userInfoList.add(newContact);
    }

    public void removeContact(String fullName) {
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).fullName.equals(fullName)) {
                k++;
                userInfoList.remove(i);
                System.out.println("Контакт успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Контакт не найден.");
        }
    }
    public void infoContacts(String number){
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).phoneNumber.equals(number)) {
                k++;

                System.out.println(userInfoList.get(i));
            }
        }
        if(k==0) {
            System.out.println("Контакт не найден.");
        }
    }
    public void printContacts() {
        System.out.println(userInfoList);
    }
}
