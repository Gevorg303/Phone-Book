package Telephone;

import Telephone.alarmclock.AlarmClock;
import Telephone.gallery.Gallery;
import Telephone.phoneBook.PhoneBook;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Открыть телефонную книгу.");
            System.out.println("2 - Открыть галерею фотографий.");
            System.out.println("3 - Открыть будильник.");
            System.out.println("4 - Выключить телефон.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                //телефонная книга
                case 1 -> {
                    PhoneBook phoneBook = new PhoneBook();
                    boolean keyPhoneBook = true;
                    while (keyPhoneBook) {
                        System.out.println("Выберите действие: ");
                        System.out.println("1 - Добавить контакт.");
                        System.out.println("2 - Удалить контакт.");
                        System.out.println("3 - Показать все контакты.");
                        System.out.println("4 - Сделать звонок.");
                        System.out.println("5 - Показать всю историю звонков.");
                        System.out.println("6 - Показать историю звонков с конкретным контактом.");
                        System.out.println("7 - Написать сообщение.");
                        System.out.println("8 - Показать всю историю сообщений.");
                        System.out.println("9 - Показать историю сообщений с конкретным контактом.");
                        System.out.println("10 - Показать всю информацию о пользователе.");
                        System.out.println("11 - Выход.");
                        int choicePhoneBook = scanner.nextInt();
                        scanner.nextLine();
                        switch (choicePhoneBook) {
                            case 1 -> {
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
                                phoneBook.userInfoHolder.addContact(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
                                System.out.println("Контакт успешно добавлен.");
                            }
                            case 2 -> {
                                System.out.println("Введите имя контакта, который хотите удалить: ");
                                String nameToRemove = scanner.nextLine();
                                phoneBook.userInfoHolder.removeContact(nameToRemove);
                            }
                            case 3 -> phoneBook.userInfoHolder.printContacts();
                            case 4 -> {
                                System.out.println("Введите номер телефона контакта которому вы хотите позвонить: ");
                                String num = scanner.nextLine();
                                phoneBook.callHolder.addCall(num);
                            }
                            case 5 -> phoneBook.callHolder.printCallHistory();
                            case 6 -> {
                                System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю звонков: ");
                                String number = scanner.nextLine();
                                phoneBook.callHolder.contactsCallHistory(number);
                            }
                            case 7 -> {
                                System.out.println("Введите номер на который вы хотите отправить сообщение: ");
                                String messageSendingNumber = scanner.nextLine();
                                System.out.println("Введите текст сообщения: ");
                                String textMessages = scanner.nextLine();
                                phoneBook.messageHolder.addMessage(messageSendingNumber, textMessages);
                            }
                            case 8 -> phoneBook.messageHolder.printMessageHistory();
                            case 9 -> {
                                System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю сообщений: ");
                                String numberM = scanner.nextLine();
                                phoneBook.messageHolder.contactsMessageHistory(numberM);
                            }
                            case 10 -> {
                                System.out.println("Введите номер телефона контакта информация о котором вы хотите посмотреть: ");
                                String number_search = scanner.nextLine();
                                System.out.println("Вся информация об этом пользоватле: ");
                                phoneBook.userInfoHolder.infoContacts(number_search);
                                phoneBook.callHolder.contactsCallHistory(number_search);
                                phoneBook.messageHolder.contactsMessageHistory(number_search);
                            }
                            case 11 -> keyPhoneBook = false;
                            default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
                        }
                    }
                }
                //галерея
                case 2 -> {
                    Gallery gallery=new Gallery();
                    boolean keyGallery = true;
                    while (keyGallery) {
                        System.out.println("Выберите действие: ");
                        System.out.println("1 - Создать новый альбом.");
                        System.out.println("2 - Удалить уже созданный альбом.");
                        System.out.println("3 - Посмотреть список альбомов.");
                        System.out.println("4 - Добавить в альбом новую фотографию.");
                        System.out.println("5 - Посмотреть фотографии в конкретном альбом.");
                        System.out.println("6 - Удалить фотографию из альбома.");
                        System.out.println("7 - Выход.");
                        int choiceGallery = scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceGallery) {
                            case 1:
                                gallery.galleryHolder.addAlbum();
                                break;
                            case 2:
                                gallery.galleryHolder.removeAlbum();
                                break;
                            case 3:
                                gallery.galleryHolder.printAlbum();
                                break;
                            case 4:
                                gallery.galleryHolder.addPhoto();
                                break;
                            case 5:
                                gallery.galleryHolder.printPhoto();
                                break;
                            case 6:
                                gallery.galleryHolder.removePhoto();
                                break;
                            case 7:
                                keyGallery = false;
                                break;
                            default:
                                System.out.println("Неверный ввод. Попробуйте еще раз.");
                        }
                    }
                }
                //будильник
                case 3 -> {
                    AlarmClock alarmClock = new AlarmClock();
                    boolean keyAlarmClock = true;

                    while (keyAlarmClock) {
                        System.out.println("Выберите действие: ");
                        System.out.println("1 - Добавить новый будильник.");
                        System.out.println("2 - Удалить уже поставленный будильник.");
                        System.out.println("3 - Посмотреть установленные будильники.");
                        System.out.println("4 - Выход.");
                        int choiceAlarmClock = scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceAlarmClock) {
                            case 1:
                                System.out.println(alarmClock.addAlarm());
                                break;
                            case 2:
                                alarmClock.removeAlarm();
                                break;
                            case 3:
                                alarmClock.printAlarm();
                                break;
                            case 4:
                                keyAlarmClock = false;
                                break;
                            default:
                                System.out.println("Неверный ввод. Попробуйте еще раз.");
                        }
                    }
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
