package Telephone.phoneBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CallHolder {
    public List<Call> callList;

    public CallHolder() {
        callList = new ArrayList<>();
    }
    public List<Call> getCall() {
        return callList;
    }
    public void addCall(String num) {
        Date dateNowCall = new Date();
        Call call = new Call(num, dateNowCall);
        callList.add(call);
        System.out.println("Звонок успешно сделан на номер: " + num);
    }
    public void printCallHistory() {
        System.out.println(callList);
    }
    public void contactsCallHistory(String num) {
        int k = 0;
        for (int i = 0; i < callList.size(); i++) {
            if (callList.get(i).number.equals(num)) {
                k++;
                System.out.println(callList.get(i));
            }
        }
        if (k == 0) {
            System.out.println("Звонков с данным контактом не найдено");
        }
    }
    @Override
    public String toString() {
        return "История звонков: "+getCall();
    }
}
