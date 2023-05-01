package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Users{
    /*
    Контактов может быть много.
    История звонов и история сообщений только одна
    */
    public List<UserInfo> userInfoList;
    MessageHistory messageHistory;
    CallHistory callHistory;
    public Users(){
        userInfoList=new ArrayList<>();
        messageHistory = new MessageHistory();
        callHistory = new CallHistory();
    }
}
