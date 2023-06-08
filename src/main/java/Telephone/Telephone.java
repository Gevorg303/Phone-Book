package Telephone;

import Telephone.alarmclock.Alarm;
import Telephone.alarmclock.AlarmClock;
import Telephone.gallery.Album;
import Telephone.gallery.Gallery;
import Telephone.gallery.Photo;
import Telephone.phoneBook.Call;
import Telephone.phoneBook.Message;
import Telephone.phoneBook.PhoneBook;
import Telephone.phoneBook.UserInfo;

import java.util.List;

public class Telephone {
    private final AlarmClock alarmClock;
    private final PhoneBook phoneBook;
    private final Gallery gallery;

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

    public void doNewUserInfo(UserInfo userInfo) {
        phoneBook.doNewUserInfo(userInfo);
    }

    public List<UserInfo> getUserInfoList(String phoneNumber) {
        return phoneBook.getUserInfoList(phoneNumber);
    }

    public void addAlarm(Alarm alarm) {
        System.out.println(alarmClock.addAlarm(alarm));
    }

    public List<Alarm> getAlarm() {
        return alarmClock.getAlarm();
    }

    public void doNewPhoto(Album album, Photo photo) {
        gallery.doNewPhoto(album,photo);
    }

    public void doNewAlbum(Album album) { gallery.doNewAlbum(album); }

    public List<Album> getAlbum() { return gallery.getAlbum(); }
}
