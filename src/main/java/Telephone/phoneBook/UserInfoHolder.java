package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserInfoHolder{
    private final List<UserInfo> userInfoList;
    public UserInfoHolder(){
        userInfoList= new ArrayList<>();
    }
    public void addContact(UserInfo userInfo) {
        userInfoList.add(userInfo);
        System.out.println("Контакт успешно добавлен.");
    }

    public void removeContact() {
        System.out.println("Введите имя контакта, который хотите удалить: ");
        String nameToRemove="?";
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).getFullName().equals(nameToRemove)) {
                k++;
                userInfoList.remove(i);
                System.out.println("Контакт успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Контакт не найден.");
        }
    }
    public List<UserInfo> printContacts(String phoneNumber) {
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).getPhoneNumber().equals(phoneNumber)) {
                return Collections.singletonList(userInfoList.get(i));
            }
        }
        return null;
    }
}
