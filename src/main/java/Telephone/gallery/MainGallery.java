package Telephone.gallery;

import java.util.Scanner;
public class MainGallery {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        Gallery gallery=new Gallery();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Создать новый альбом.");
            System.out.println("2 - Удалить уже созданный альбом.");
            System.out.println("3 - Посмотреть список альбомов.");
            System.out.println("4 - Добавить в альбом новую фотографию.");
            System.out.println("5 - Посмотреть фотографии в конкретном альбом.");
            System.out.println("6 - Удалить фотографию из альбома.");
            System.out.println("7 - Выход.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    gallery.addAlbum();
                    break;
                case 2:
                    gallery.removeAlbum();
                    break;
                case 3:
                    gallery.printAlbum();
                    break;
                case 4:
                    gallery.addPhoto();
                    break;
                case 5:
                    gallery.printPhoto();
                    break;
                case 6:
                    gallery.removePhoto();
                    break;
                case 7:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
