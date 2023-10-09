package ra.run;

import model.Singer;
import model.Song;

import java.util.Scanner;

public class MusicManagement {
    static Scanner scanner = new Scanner(System.in);
    static Singer [] arrSinger = new Singer[100];
    static  int currentIndex = 0;


    static Song [] arrSong = new Song[100];
    static int currentSong = 0;
    public static void main(String[] args) {
        int choice = 0;
        String menuAdmin = "************************MUSIC-MANAGEMENT************************* \n" +
                "1.Quản lý ca sĩ\n" +
                "2. Quản lý bài hát\n" +
                "3.Tìm kiếm bài hát\n" +
                "4.Thoát\n";
        do {
            System.out.println(menuAdmin);
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showMenuSinger();
                    break;
                case 2:
                   showMenuSong();
                    break;
                case 3:
                    showSearchManager();
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 4);
    }

    private static void showSearchManager() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String menusong = "**************************SEARCH-MANAGEMENT************************* \n" +
                "1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại\n" +
                "2..Tìm kiếm ca sĩ theo tên hoặc thể loại \n" +
                "3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần \n" +
                "4.Hiển thị 10 bài hát được đăng mới nhất \n" +
                "5.Thoát\n";
        do {
            System.out.println(menusong);
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên ca sĩ hoặc thể loại bài hát:");
                    String keyword = scanner.nextLine().trim().toLowerCase();
                    boolean found = false;
                    for (Song song : arrSong) {
                        if (song != null && (song.getSinger().getSingerName().toLowerCase().contains(keyword)
                                || song.getSinger().getGenre().toLowerCase().contains(keyword))) {
                           song.displayData(scanner);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy bài hát nào phù hợp với từ khóa \"" + keyword + "\"");
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên hoặc thể loại ca sĩ:");
                    String keyword1 = scanner.nextLine().trim().toLowerCase();
                    boolean found1 = false;
                    for (Singer singer : arrSinger) {
                        if (singer != null && (singer.getSingerName().toLowerCase().contains(keyword1)
                                || singer.getGenre().toLowerCase().contains(keyword1))) {
                            singer.displayData();
                            found1 = true;
                        }
                    }
                    if (!found1) {
                        System.out.println("Không tìm thấy ca sĩ nào phù hợp với từ khóa \"" + keyword1 + "\"");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 5);
    }


    private static void showMenuSong() {
        int choice = 0;
        String menusong = "**************************SONG-MANAGEMENT************************* \n" +
                "1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới\n" +
                "2.Hiển thị danh sách tất cả bài hát đã lưu trữ\n" +
                "3.Thay đổi thông tin bài hát theo mã id\n" +
                "4.Xóa bài hát theo mã id\n" +
                "5.Thoát\n";
        do {
            System.out.println(menusong);
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    displayAllSong();
                    break;
                case 3:
                    editSong();
                    break;
                case 4:
                    deleteSong();
                    break;
                    case 5:
                        break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 5);
    }

    private static void deleteSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bài hát mà bạn muốn xóa");
        String deleteSongId = scanner.nextLine();
        for (int i = 0; i <currentSong ; i++) {
            if (deleteSongId.equals(arrSong[i].getSongId())){
                for (int j = 0; j <currentSong ; j++) {
                    arrSong[j]=arrSong[j+1];
                }
                currentSong--;
                return;
            }
            System.out.println("Không tìm thấy id vừa nhập");
        }
    }

    // cập nhật bài hát
    private static void editSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id bài hát muốn cập nhật");
        String editSongId = scanner.nextLine();
        for (int i = 0; i <currentSong ; i++) {
            if (editSongId.equals(arrSong[i].getSongId())){
                System.out.println("Thông tin của bài hát mà bạn muốn cập nhật");
                arrSong[i].displayData(scanner);
                arrSong[i].inputData(arrSinger,currentIndex,scanner);
                System.out.println("Đã cập nhât thành công");
                return;
            }
            System.out.println("Không tìm thấy Id bài hát");
        }
    }


    // hiển th danh sách bài hát
    private static void displayAllSong() {
        System.out.println("***Danh sách tất cả bài hát:");
        for (int i = 0; i < currentSong; i++) {
            arrSong[i].displayData(scanner);
        }
    }

    // thêm mới bài hát
    private static void addSong() {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        song.inputData(arrSinger,currentIndex,scanner);
        arrSong[currentSong++] = song;
    }


    public static void showMenuSinger(){
        int choice = 0;
        String menu = "*************************SINGER-MANAGEMENT************************* \n" +
                "1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới\n" +
                "2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ\n" +
                "3.Thay đổi thông tin ca sĩ theo mã id\n" +
                "4.Xóa ca sĩ theo mã id\n" +
                "5.Thoát\n";
        do {
            System.out.println(menu);
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addSingle();
                    break;
                case 2:
                    displayAllSingle();
                    break;
                case 3:
                    editSingle();
                    break;
                case 4:
                    deleteSingle();
                    break;
                    case 5:
                        break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 5);
    }
// XÓA CÃ SỸ THEO ID
    private static void deleteSingle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id ca sỹ mà bạn muốn xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <currentIndex ; i++) {
            if (arrSinger[i].getSingerId()==deleteId){
                for (int j = 0; j <currentIndex ; j++) {
                    arrSinger[j]=arrSinger[j+1];
                }
                currentIndex--;
                return;
            }
            System.out.println("Không tìm thấy id vừa nhập");
        }
    }
// CẬP NHẬT LẠI CA SĨ
    private static void editSingle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id muốn cập nhật");
        int editId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <currentIndex ; i++) {
            if (arrSinger[i].getSingerId()==editId){
                System.out.println("Thông tin của ca sĩ mà bạn muốn cập nhật");
                arrSinger[i].displayData();
                arrSinger[i].inputData(scanner);
                System.out.println("Đã cập nhât thành công");
                return;
            }
            System.out.println("Không tìm thấy Id");
        }
    }
// HIỂN THỊ DANH SÁCH CA SỸ
    private static void displayAllSingle() {
        System.out.println("***Danh sách tất cả ca sĩ:");
        for (int i = 0; i < currentIndex; i++) {
            arrSinger[i].displayData();
        }
    }
// THÊM MỚI CA SỸ
    private static void addSingle() {
        Scanner scanner = new Scanner(System.in);
        Singer singer = new Singer();
        singer.inputData(scanner);
        arrSinger[currentIndex++] = singer;
    }

}


