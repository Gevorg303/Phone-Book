package Telephone.gallery;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final String name; /* Название альбома (уникальное поле, т. к.
                            не может быть два альбома с одинаковым названием)*/
    private final List<Photo> photos;

    public String getName() {
        return name;
    }
    public List<Photo> getPhotos() {
        return photos;
    }
    public Album(String name){
        this.name=name;
        photos=new ArrayList<>();
    }
    @Override
    public String toString() {
        return "\nНазвание альбома: "+name+"    \nФотографии в данном альбоме: "+photos;
    }
}
