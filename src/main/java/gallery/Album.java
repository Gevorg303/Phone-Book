package gallery;

import java.util.List;

public class Album {
    private  String name; /* Название альбома (уникальное поле, т. к.
                            не может быть два альбома с одинаковым названием)*/
    private List<Photo> photos;
}
