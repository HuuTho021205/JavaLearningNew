package Ngay7_CollectionsFrameWork.List.LuyenTapList.PlaylistNhac;

import java.util.Scanner;

public class MainPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaylistManager playlistManager = new PlaylistManager();
        System.out.println("Nhap so luong bai hat muon them: ");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            Song song = new Song();
            song.scanSong(sc);
            playlistManager.addSong(song);
        }
        System.out.println("Danh sach phat: ");
        for (int i = 0; i < playlistManager.getPlayList().size() ; i++) {
            playlistManager.getPlayList().get(i).displayInfo();
        }
        System.out.println("Nhap ten bai hat muon them: ");
        Song newSong1 = new Song();
        newSong1.scanSong(sc);
        playlistManager.addSong(newSong1);

        System.out.println("Nhap ten bai hat muon them: ");
        Song newSong2 = new Song();
        newSong2.scanSong(sc);
        System.out.println("Them bai hat vao vi tri thu ?");
        int index = Integer.parseInt(sc.nextLine());
        playlistManager.addSong(index-1 ,newSong2);

        System.out.println("Nhap vao ten bai hat ban muon xoa: ");
        String nameRemove = sc.nextLine();
        playlistManager.removeSongByTitle(nameRemove);

        System.out.println("Danh sach phat sau khi chinh sua: ");
        for (int i = 0; i < playlistManager.getPlayList().size() ; i++) {
            playlistManager.getPlayList().get(i).displayInfo();
        }

        playlistManager.startPlaylist();
    }
}
