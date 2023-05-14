package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Users{
    UserInfoHolder userInfoHolder;
    MessageHistory messageHistory;
    CallHistory callHistory;
    public Users(){
        userInfoHolder = new UserInfoHolder();
        messageHistory = new MessageHistory();
        callHistory = new CallHistory();
    }
}
