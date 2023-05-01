package Telephone.gallery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Gallery {
    Scanner scanner = new Scanner(System.in);
    /* Любая фотография обязательно должна быть в каком то альбоме */
    List<Album> albumList;
    protected Gallery(){
        albumList=new ArrayList<>();
    }
    protected void addAlbum(){
        System.out.println("Введите название альбома: ");
        String name = scanner.nextLine();
        Album newAlbum = new Album(name);
        albumList.add(newAlbum);
        System.out.println("Альбом успешно создан");
    }
    protected void printAlbum(){
        System.out.println("Список альбомов: ");
        System.out.println(albumList);
    }
    protected void removeAlbum(){
        System.out.println("Введите название альбома которое вы хотите удалить: ");
        String name = scanner.nextLine();
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).name.equals(name)) {
                k++;
                albumList.remove(i);
                System.out.println("Альбом успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Альбом с таким названием не найден.");
        }
    }
    protected void addPhoto(){
        System.out.println("Введите название альбома в которую вы хотите добавить фотографию: ");
        String nameAlbum = scanner.nextLine();
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).name.equals(nameAlbum)) {
                k++;
                System.out.println("Введите названия фотографии");
                String namePhoto = scanner.nextLine();
                Date date = new Date();
                System.out.println("Высота изображения: ");
                short width = Short.parseShort(scanner.nextLine());
                System.out.println("Ширина изображения: ");
                short height = Short.parseShort(scanner.nextLine());
                Photo newPhoto = new Photo(namePhoto, date, width, height);
                albumList.get(i).photos.add(newPhoto);
                System.out.println("Фотография успешно добавлена.");
            }
        }
        if(k==0) {
            System.out.println("Альбом с таким названием не найден.");
        }
    }
    protected void printPhoto(){
        System.out.println("Введите название альбома которое вы хотите открыть: ");
        String nameAlbum = scanner.nextLine();
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).name.equals(nameAlbum)) {
                k++;
                System.out.println(albumList.get(i));
            }
        }
        if(k==0) {
            System.out.println("Альбом с таким названием не найден.");
        }
    }
    protected void removePhoto(){
        System.out.println("Введите название альбома из которого вы хотите удалить фотографию: ");
        String nameAlbum = scanner.nextLine();
        int k=0;
        for (int i=0; i<albumList.size(); i++) {
            if (albumList.get(i).name.equals(nameAlbum)) {
                k++;
                System.out.println("Введите названия фотографии которое вы хотите удалить: ");
                String namePhoto = scanner.nextLine();
                for (int j =0; j<albumList.get(i).photos.size();j++){
                    if (albumList.get(i).photos.get(j).name.equals(namePhoto)){
                        albumList.get(i).photos.remove(j);
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
