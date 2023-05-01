package Telephone.phoneBook;

import java.util.Date;

public class Call{
    Date dateNow;
    String number;
    public Call(String number, Date dateNow) {
        this.number = number;
        this.dateNow = dateNow;
    }
    @Override
    public String toString() {
        return "\nНомер: "+number+"   Дата звонка: "+dateNow;
    }
}
