    package baitap;

    import java.io.*;
    import java.util.Arrays;

    public class Bt1 {
    //    Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.
    //    Hướng dẫn:
    //    B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)
    //    B2: Tạo hàm đọc file trên và trả ra String.
    //    B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
    //    B4: length của mảng trên chính là số lượng từ trong file.
        public static void main(String[] args) throws IOException {
            // b1
            File file = new File("src/Baitap/src/Bt1.txt");
            file.createNewFile();
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("hello world!");
            filewriter.close();
            // b2
            FileReader reader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str = bufferedReader.readLine();
            // b3
            String [] arr = str.split(" ");
            System.out.println(Arrays.toString(arr));
            // b4
            System.out.println("số lượng tử trong file là: " +str.length());

        }

    }
