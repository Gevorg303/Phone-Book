package Telephone;

import Telephone.alarmclock.AlarmClock;
import Telephone.gallery.Gallery;
import Telephone.phoneBook.Call;
import Telephone.phoneBook.Message;
import Telephone.phoneBook.PhoneBook;

import java.util.List;
import java.util.Scanner;

public class Telephone {

    private AlarmClock alarmClock;
    private PhoneBook phoneBook;
    private Gallery gallery;

    public Telephone() {
        this.alarmClock = new AlarmClock();
        this.phoneBook = new PhoneBook();
        this.gallery = new Gallery();
    }
    public void doNewCall(Call call) {
        phoneBook.doNewCall(call);
    }
    public List<Call> getCallHistory(String phoneNumber) {
        return phoneBook.getCallHistory(phoneNumber);
    }
    public void doNewMassage(Message message) {
        phoneBook.doNewMassage(message);
    }

    public List<Message> getMessageHistory(String phoneNumber) {
        return phoneBook.getMessageHistory(phoneNumber);
    }
}
