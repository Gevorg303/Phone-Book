package org.example;

import java.util.ArrayList;


public class CallHistory {
    public String unknownNumber;

    public CallHistory(String unknownNumber) {
        this.unknownNumber = unknownNumber;
    }

    @Override
    public String toString() {
        return unknownNumber;
    }
}
