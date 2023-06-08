package Telephone;

import Telephone.alarmclock.Alarm;
import Telephone.gallery.Album;
import Telephone.gallery.Photo;
import Telephone.phoneBook.Call;
import Telephone.phoneBook.Message;
import Telephone.phoneBook.UserInfo;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Telephone telephone = new Telephone();

        System.out.println("---------Телефоная книга--------");
        telephone.doNewCall(new Call("+7333", new Date()));
        List<Call> callHistory = telephone.getCallHistory("+7333");

        telephone.doNewMassage(new Message("+7111", "Ура, я заработал!", new Date()));
        List<Message> messageHistory = telephone.getMessageHistory("+7111");

        telephone.doNewUserInfo(new UserInfo("Пупкин","+7444", "tutu@mail.ru", "Кострома","21-23","Дом деда мороза"));
        List<UserInfo> userInfoList  = telephone.getUserInfoList("+7444");

        System.out.println(callHistory);
        System.out.println(messageHistory);
        System.out.println(userInfoList);

        System.out.println("\n-----------Будильник-----------");
        telephone.addAlarm(new Alarm("2023-03-12 12:45:21", true, "пумпум","Пора работать"));
        List<Alarm> alarmList = telephone.getAlarm();
        System.out.println(alarmList);

        System.out.println("\n-----------Галерея-----------");
        telephone.doNewAlbum(new Album("Фотки2023"));
        telephone.doNewPhoto(new Album("Фотки2023"), new Photo("Медведь", new Date(), (short) 218, (short) 128));
        List<Album> albumList = telephone.getAlbum();
        System.out.println(albumList);
    }
}
