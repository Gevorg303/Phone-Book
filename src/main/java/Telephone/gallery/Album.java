package Telephone.gallery;

import java.util.ArrayList;
import java.util.List;

public class Album {
    public   String name; /* Название альбома (уникальное поле, т. к.
                            не может быть два альбома с одинаковым названием)*/
    public List<Photo> photos;
    protected Album(String name){
        this.name=name;
        photos=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\n\nНазвание альбома: "+name+"    \nФотографии в данном альбоме: "+photos;
    }
}
