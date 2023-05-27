package Telephone.gallery;

import java.util.Scanner;

public class Gallery {
    public GalleryHolder galleryHolder;
    public Gallery(){
       galleryHolder = new GalleryHolder();
    }
    @Override
    public String toString() {
        boolean keyGallery = true;
        while (keyGallery) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Создать новый альбом.");
            System.out.println("2 - Удалить уже созданный альбом.");
            System.out.println("3 - Посмотреть список альбомов.");
            System.out.println("4 - Добавить в альбом новую фотографию.");
            System.out.println("5 - Посмотреть фотографии в конкретном альбом.");
            System.out.println("6 - Удалить фотографию из альбома.");
            System.out.println("7 - Выход.");
            Scanner scanner = new Scanner(System.in);
            int choiceGallery = scanner.nextInt();
            switch (choiceGallery) {
                case 1:
                    galleryHolder.addAlbum();
                    break;
                case 2:
                    galleryHolder.removeAlbum();
                    break;
                case 3:
                    galleryHolder.printAlbum();
                    break;
                case 4:
                    galleryHolder.addPhoto();
                    break;
                case 5:
                    galleryHolder.printPhoto();
                    break;
                case 6:
                    galleryHolder.removePhoto();
                    break;
                case 7:
                    keyGallery = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        return "Вы закрыли галерею";
    }
}
