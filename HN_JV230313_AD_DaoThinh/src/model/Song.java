package model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String description;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song(){
        this.createdDate = new Date();
    }

    public Song(String songId, String songName, String description, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.description = description;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = new Date();
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

        public void inputData(Singer [] arrSinger,int currentIndex,Scanner scanner){
        Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nhập mã bài hát");
            this.songId = scanner.nextLine();
        System.out.print("Nhập tên bài hát: ");
        while (true){
            this.songName = scanner.nextLine();
            if (songName.isEmpty()){
                System.out.println("*Tên bài hát không được để trống");
            }else {
                break;
            }
        }
        System.out.print("Nhập mô tả: ");
        while (true){
            this.description = scanner.nextLine();
            if (description.length()<10){
                System.out.println("Mô tả không được ít hơn 10 kí tự");
            }else {
                break;
            }
        }
        for (int i = 0; i <currentIndex ; i++) {
            System.out.println(arrSinger[i].getSingerId()+ arrSinger[i].getSingerName());
        }
        System.out.println("Nhập mã ca sĩ");
        int singerId  = scanner.nextInt();
        Singer singer = null;
        for (int i = 0; i <currentIndex ; i++) {
            if (arrSinger[i].getSingerId()==singerId){
                singer = arrSinger[i];
                break;
            }
        }
        if (singer == null){
            System.out.println("Không tìm thấy,vui lòng nhập thông tin ca sĩ mới");
            Singer newSinger = new Singer();
            newSinger.inputData(scanner);
            currentIndex++;
            singer = newSinger;
            this.singer = singer;

        }
        System.out.println("Nhập tên người sáng tác");
        this.songWriter = scanner.nextLine();
        this.songStatus = true;

    }

    public void displayData(Scanner scanner) {
        System.out.println(
                "Mã bài hát: " + songId + " | " +
                        "Tên bài hát: '" + songName + "' | " +
                        "Mô tả: '" + description + "' | " +
                        "Ca sĩ: " + singer + " | " +
                        "Sáng tác: " + songWriter + " | " +
                        "Ngày tạo: " + createdDate + " | " +
                        "Trạng thái: " + songStatus + " | "
        );
    }
}
