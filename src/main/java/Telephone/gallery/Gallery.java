package Telephone.gallery;

import java.util.List;

public class Gallery {
    private final GalleryHolder galleryHolder;
    public Gallery(){
       galleryHolder = new GalleryHolder();
    }
    public void doNewPhoto(Album album, Photo photo) {
        galleryHolder.addPhoto(album, photo);
    }

    public void doNewAlbum(Album album) {
        galleryHolder.addAlbum(album);
    }

    public List<Album> getAlbum() {
        return galleryHolder.printAlbum();
    }
}
