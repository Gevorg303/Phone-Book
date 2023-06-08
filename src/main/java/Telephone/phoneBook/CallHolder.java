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

        for (int i = 0; i < callList.size(); i++) {
            if (callList.get(i).getNumber().equals(phoneNumber)) {
                return Collections.singletonList(callList.get(i));
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "История звонков: "+getCall();
    }
}
