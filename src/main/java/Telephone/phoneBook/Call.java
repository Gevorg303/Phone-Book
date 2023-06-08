package Telephone.phoneBook;

import java.util.Date;

public class Call{
    private Date dateNow;
    private String number;
    public Call(String number, Date dateNow) {
        this.number = number;
        this.dateNow = dateNow;
    }

    public Date getDateNow() {
        return dateNow;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\nНомер: "+number+"   Дата звонка: "+dateNow;
    }
}
