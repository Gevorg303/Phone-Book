package org.example;

public class Users {
    UserInfo userInfo;
    CallHistory callHistory;
    MessageHistory messageHistory;
    public Users(UserInfo userInfo, CallHistory callHistory, MessageHistory messageHistory){
        this.userInfo=userInfo;
        this.callHistory=callHistory;
        this.messageHistory=messageHistory;
    }
}
