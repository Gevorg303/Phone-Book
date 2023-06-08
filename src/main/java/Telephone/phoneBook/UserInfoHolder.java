package Telephone.phoneBook;

import java.util.ArrayList;
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

    public void removeContact(String nameToRemove) {
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).getFullName().equals(nameToRemove)) {
                userInfoList.remove(i);
                System.out.println("Контакт успешно удален.");
            }
        }
    }
    public List<UserInfo> printContacts(String phoneNumber) {
        List<UserInfo> matchingUserInfo = new ArrayList<>();
        for (UserInfo userInfo : userInfoList) {
            if (userInfo.getPhoneNumber().equals(phoneNumber)) {
                matchingUserInfo.add(userInfo);
            }
        }
        return matchingUserInfo;
    }
}
