package org.example;

import java.util.ArrayList;
import java.util.List;

public class Users{
    public List<UserInfo> userInfoList;
    public List<CallHistory> callHistoryList;
    public List<MessageHistory> messageHistoryList;
    public Users(){
        userInfoList=new ArrayList<>();
        callHistoryList=new ArrayList<>();
        messageHistoryList=new ArrayList<>();
    }
}
