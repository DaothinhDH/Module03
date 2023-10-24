import java.io.File;

public class DemoFile {
    public static void main(String[] args) throws Exception {
//        File dataFile = new File("data.txt");
//        if (dataFile.createNewFile()) {
//            System.out.println("Tạo file thành công");
//            return;
//        }
//        System.out.println("Tạo file không thành công");
//
//
//        File inputDir = new File("input");
//        if (inputDir.mkdir()) {
//            System.out.println("Tạo folder thành công");
//            return;
//        }
//        System.out.println("Tạo folder không thành công");
//
//
//        File subFolder = new File("src/sub");
//        if (subFolder.mkdir()) {
//            File inputFile = new File("src/sub/input.txt");
//            inputFile.createNewFile();
//        }
//
//        File srcFile = new File("src");
//        File[] subArr = srcFile.listFiles();
//        System.out.println("Folder" + srcFile.getName() + "có các tệp và thư mục con sau");
//        for (File sub : subArr) {
//            System.out.println(sub.getName());
//        }


//        ========================================
        File data = new File("data");
        data.mkdir();

        File inputTxt = new File("data/input.txt");
        inputTxt.createNewFile();

        File Demo = new File("data/demo.java");
        Demo.createNewFile();


        File sub1 = new File("data/sub1");
        sub1.mkdir();
        File output = new File("data/sub1/output.txt");
        output.createNewFile();
        File student = new File("data/sub1/student.data");
        student.createNewFile();

        File sub2 = new File("data/sub2");
        sub2.mkdir();
        System.out.println("Thông tin thư mục: ");
        display(data,"");

    }
    public static void display(File file,String x){
        System.out.println(x +  file.getName());
        if (file.isDirectory()){
            for (File sub : file.listFiles()){
                display(sub, x + "-");
            }
        }
    }
}
