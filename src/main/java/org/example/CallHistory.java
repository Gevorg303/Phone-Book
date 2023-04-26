package org.example;

import java.util.ArrayList;
import java.util.List;


public class CallHistory {
    public List<Call> callList;

    public CallHistory() {
        callList = new ArrayList<>();
    }
    public List<Call> getCall() {
        return callList;
    }
    @Override
    public String toString() {
        return "История звонков: "+getCall();
    }
}
