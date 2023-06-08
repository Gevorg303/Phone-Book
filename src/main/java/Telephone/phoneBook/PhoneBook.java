package Telephone.phoneBook;

import java.util.List;

public class PhoneBook{
    private final UserInfoHolder userInfoHolder;
    private final MessageHolder messageHolder;
    private final CallHolder callHolder;
    public PhoneBook(){
        userInfoHolder = new UserInfoHolder();
        messageHolder = new MessageHolder();
        callHolder = new CallHolder();
    }
    public void doNewCall(Call call) {
        callHolder.addCall(call);
    }
    public List<Call> getCallHistory(String phoneNumber) {
        return callHolder.printCallHistory(phoneNumber);
    }

    public void doNewMassage(Message message) {
        messageHolder.addMessage(message);
    }
    public List<Message> getMessageHistory(String phoneNumber) {
        return messageHolder.printMessageHistory(phoneNumber);
    }

    public void doNewUserInfo(UserInfo userInfo) {
        userInfoHolder.addContact(userInfo);
    }

    public List<UserInfo> getUserInfoList(String phoneNumber) {
        return userInfoHolder.printContacts(phoneNumber);
    }


}