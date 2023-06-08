package Telephone.gallery;

import Telephone.phoneBook.Call;

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
    public void removeAlbum(String name){
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).getName().equals(name)) {
                albumList.remove(i);
                System.out.println("Альбом успешно удален.");
            }
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
        List<Album> matchingAlbum = new ArrayList<>();
        for (Album album : albumList) {
            if (album.getName().equals(nameAlbum)) {
                matchingAlbum.add(album);
            }
        }
        return matchingAlbum;
    }
    public void removePhoto(String nameAlbum, String namePhoto){
        for (Album album : albumList) {
            if (album.getName().equals(nameAlbum)) {
                for (int j = 0; j < album.getPhotos().size(); j++) {
                    if (album.getPhotos().get(j).getName().equals(namePhoto)) {
                        album.getPhotos().remove(j);
                        System.out.println("Фотография успешно удалена.");
                    }
                }
            }
        }
    }
}
