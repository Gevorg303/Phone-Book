package Telephone.gallery;

import java.util.Date;

public class Photo {
    private final String name; /* К примеру: photo.png */
    private final Date date; /* Когда сделана фотография */
    private final short resolutionWidth;
    private final short resolutionHeight;
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public short getResolutionWidth() {
        return resolutionWidth;
    }
    public short getResolutionHeight() {
        return resolutionHeight;
    }
    public Photo(String name, Date date, short resolutionHeight, short resolutionWidth){
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
