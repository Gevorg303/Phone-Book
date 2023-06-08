package Telephone.gallery;

import java.util.*;

public class GalleryHolder {
    private final List<Album> albumList;
    public GalleryHolder(){

        albumList = new ArrayList<>();
    }
    public void addAlbum(Album album){
        albumList.add(album);
        System.out.println("Альбом успешно создан");
    }
    public List<Album> printAlbum(){
        System.out.println("Список альбомов: ");
        return albumList;
    }
    public void removeAlbum(){
        System.out.println("Введите название альбома которое вы хотите удалить: ");
        String name ="?";
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).getName().equals(name)) {
                k++;
                albumList.remove(i);
                System.out.println("Альбом успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Альбом с таким названием не найден.");
        }
    }
    public void addPhoto(Album album, Photo photo){
        for (Album value : albumList) {
            if (value.getName().equals(album.getName())) {
                value.getPhotos().add(photo);
                System.out.println("Фотография успешно добавлена.");
            }
        }
    }
    public List<Album> printPhoto(String nameAlbum){
        for (Album album : albumList) {
            if (album.getName().equals(nameAlbum)) {
                return Collections.singletonList(album);
            }
        }
        return null;
    }
    public void removePhoto(){
        System.out.println("Введите название альбома из которого вы хотите удалить фотографию: ");
        String nameAlbum ="?";
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).getName().equals(nameAlbum)) {
                k++;
                System.out.println("Введите названия фотографии которое вы хотите удалить: ");
                String namePhoto = "?";
                for (int j = 0; j< albumList.get(i).getPhotos().size(); j++){
                    if (albumList.get(i).getPhotos().get(j).getName().equals(namePhoto)){
                        albumList.get(i).getPhotos().remove(j);
                        System.out.println("Фотография успешно удалена.");
                    }
                }
            }
        }
        if(k==0) {
            System.out.println("Альбом с таким названием не найден.");
        }
    }
}
