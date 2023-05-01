package Telephone.gallery;

import java.util.Date;

public class Photo {
    public String name; /* К примеру: photo.png */
    private Date date; /* Когда сделана фотография */
    private short resolutionWidth;
    private short resolutionHeight;
    protected Photo(String name, Date date, short resolutionHeight, short resolutionWidth){
        this.name=name;
        this.date=date;
        this.resolutionHeight=resolutionHeight;
        this.resolutionWidth=resolutionWidth;
    }

    @Override
    public String toString() {
        return "\n   Название фотографии: "+name+"    Когда сделана фотография: "+ date+"    Разрешение изображения: "+resolutionWidth+"x"+resolutionHeight;
    }
}
