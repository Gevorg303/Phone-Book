package org.example;

import java.util.ArrayList;


public class CallHistory {
    ArrayList<String> arrayList = new ArrayList<>();

    public void addCall(String unknownNumber) {
        arrayList.add(unknownNumber);
    }
    public void addHistory() {
        if (arrayList.isEmpty()) {
            System.out.println("История пуста");
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
