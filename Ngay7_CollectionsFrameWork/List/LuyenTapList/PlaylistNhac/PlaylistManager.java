package Ngay7_CollectionsFrameWork.List.LuyenTapList.PlaylistNhac;

import java.util.*;

/*Tạo lớp PlaylistManager:
Bên trong, nó sẽ chứa một List<Song> làm playlist.
Yêu cầu: Hãy khởi tạo List này bằng new LinkedList<>();.
Phương thức:
void addSong(Song song): Thêm bài hát vào cuối playlist.
void addSongAt(int index, Song song): Thêm bài hát vào một vị trí cụ thể.
void removeSongByTitle(String title): Xóa bài hát dựa trên tên (dùng Iterator an toàn).*/


/*Thử thách ListIterator:
Trong PlaylistManager, hãy viết một phương thức void startPlaylist():
Bên trong, bạn sẽ dùng ListIterator<Song> iterator = this.playlist.listIterator();.
Tạo một vòng lặp while(true) (vòng lặp vô hạn) mô phỏng một trình phát nhạc.
Hỏi người dùng: "Nhập 'next' (tiếp), 'prev' (trước), 'quit' (thoát):"
Nếu nhập "next": Kiểm tra iterator.hasNext() và gọi iterator.next() để "phát" bài hát (in ra tên).
Nếu nhập "prev": Kiểm tra iterator.hasPrevious() và gọi iterator.previous() để "quay lại" (in ra tên).*/
//Nếu nhập "quit": break vòng lặp.
public class PlaylistManager {
    private List<Song> playList;


    public PlaylistManager() {
        this.playList = new LinkedList<>();
    }

    public List<Song> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Song> playList) {
        this.playList = playList;
    }

    public void addSong(Song song) {
        playList.add(song);
        System.out.println("Them bai nhac thanh cong ");
    }

    public void addSong(int index, Song song) {
        playList.add(index, song);
        System.out.println("Da them bai nhac vao vi tri " + (index + 1)+ " thanh cong ");
    }

    public void removeSongByTitle(String titleSong) {
        if (playList.isEmpty()) {
            System.out.println("Danh sach trong ");
            return;
        }
        boolean findRemove = false;
        Iterator<Song> iterator = this.playList.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getTitle().equalsIgnoreCase(titleSong)) {
                iterator.remove();
                System.out.println("Da xoa thanh cong ");
                findRemove = true;
            }
        }
        if (!findRemove) {
            System.out.println("Khong tim thay bai nhac");
        }
    }

    public void startPlaylist() {
        Scanner sc = new Scanner(System.in);
        ListIterator<Song> iterator = this.playList.listIterator();
        while (true) {
            System.out.println("Nhập 'next' (tiếp), 'prev' (trước), 'quit' (thoát):");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("next")) {
                if (iterator.hasNext()) {
                    Song song = iterator.next();
                    System.out.println("Dang phat bai hat " + song.getTitle());
                }
                else {
                    System.out.println("Danh sach phat da het");
                }
            } else if (choice.equalsIgnoreCase("prev")) {
                if (iterator.hasPrevious()) {
                    Song song = iterator.previous();
                    System.out.println("Dang quay lai bai hat " + song.getTitle());
                }
                else {
                    System.out.println("Day la bai dau tien ");
                }
            } else if (choice.equalsIgnoreCase("quit")) {
                System.out.println("Da thoat");
                return;
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long nhap lai");
            }
        }
    }

}
