package Telephone.phoneBook;

public class PhoneBook{
    public UserInfoHolder userInfoHolder;
    public MessageHolder messageHolder;
    public CallHolder callHolder;
    public PhoneBook(){
        userInfoHolder = new UserInfoHolder();
        messageHolder = new MessageHolder();
        callHolder = new CallHolder();
    }
}