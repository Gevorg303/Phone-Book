package Telephone.phoneBook;

public class Users{
    public UserInfoHolder userInfoHolder;
    public MessageHolder messageHolder;
    public CallHolder callHolder;
    public Users(){
        userInfoHolder = new UserInfoHolder();
        messageHolder = new MessageHolder();
        callHolder = new CallHolder();
    }
}
