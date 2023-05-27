package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoHolder{
    List<UserInfo> userInfoList;
    Scanner scanner = new Scanner(System.in);
    public UserInfoHolder(){
        userInfoList= new ArrayList<>();
    }
    public void addContact() {
        System.out.println("Введите имя контакта: ");
        String fullName = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Введите е-маил: ");
        String email = scanner.nextLine();
        System.out.println("Введите адрес контакта: ");
        String address = scanner.nextLine();
        System.out.println("Введите номер организации: ");
        String organizationPhoneNumber = scanner.nextLine();
        System.out.println("Введите название организации: ");
        String organization = scanner.nextLine();
        UserInfo newContact = new UserInfo(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
        userInfoList.add(newContact);
        System.out.println("Контакт успешно добавлен.");
    }

    public void removeContact() {
        System.out.println("Введите имя контакта, который хотите удалить: ");
        String nameToRemove = scanner.nextLine();
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).fullName.equals(nameToRemove)) {
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
