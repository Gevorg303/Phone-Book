package Telephone.phoneBook;

import java.util.*;

public class CallHolder {
    private List<Call> callList;

    public CallHolder() {
        callList = new ArrayList<>();
    }
    public List<Call> getCall() {
        return callList;
    }
    public void addCall(Call call) {
        callList.add(call);
        System.out.println("Звонок успешно сделан на номер: " + call.getNumber());
    }
    public List<Call> printCallHistory(String phoneNumber) {
        List<Call> matchingCall = new ArrayList<>();
        for (Call call : callList) {
            if (call.getNumber().equals(phoneNumber)) {
                matchingCall.add(call);
            }
        }
        return matchingCall;
    }
    @Override
    public String toString() {
        return "История звонков: "+getCall();
    }
}
