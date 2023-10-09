package model;

import java.util.Scanner;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;
    static  int count =1;

    public Singer() {
        this.singerId = count++;
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = count++;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }


    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData(Scanner scanner) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên ca sĩ:");
        while (true){
            this.singerName = scanner.nextLine();
            if (singerName.isEmpty()){
                System.out.println("*Tên ca sỹ không được để trống");
            }else {
                break;
            }
        }
        System.out.println("Nhập tuổi:");
         while (true){
             this.age = Integer.parseInt(scanner.nextLine());
             if (age<0){
                 System.out.println("Số tuổi phải lớn hơn 0");
             }else {
                 break;
             }
         }
        System.out.println("Nhập quốc tịch:");
        while (true){
            this.nationality = scanner.nextLine();
            if (nationality.isEmpty()){
                System.out.println("*Không được để trống");
            }else {
                break;
            }
        }
        System.out.println("Nhập giới tính true hoặc false (true là: Nam/ false là: Nữ):");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhập thể loại:");
        while (true){
            this.genre = scanner.nextLine();
            if (genre.isEmpty()){
                System.out.println("*Không được để trống");
            }else {
                break;
            }
        }
    }

    public void displayData() {
        System.out.println(
                "Mã ca sĩ: " + singerId + " | " +
                        "Tên Ca sỹ: '" + singerName + "' | " +
                        "Tuổi: '" + age + "' | " +
                        "Quốc tịch: " + nationality + " | " +
                        "Giới tính: " + (gender?"Nam":"Nữ") + " | " +
                        "Thể loại: " + genre + " | "
        );
    }
}
