package Ngay7_CollectionsFrameWork.List.LuyenTapList.PlaylistNhac;

import java.util.Scanner;

/*Tạo lớp Song: Gồm 2 thuộc tính: String title (tên bài) và String artist (nghệ sĩ).*/
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public Song(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void scanSong (Scanner scanner){
        System.out.println("Nhap ten bai hat: ");
        this.title = scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        this.artist = scanner.nextLine();
    }
    public void displayInfo(){
        System.out.println("Ten bai hat: " + this.getTitle());
        System.out.println("Ten tac gia: " + this.getArtist());
    }
}
