package Baitap;

public class TinhTong1Mang {
    public static void main(String[] args) {
            Integer [] arr = {1,2,3,4,5,6,7,8,9};
            try {
                int sum = sumArray(arr);
                System.out.println("Tổng mảng số nguyên " +sum);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
    public static int sumArray (Integer[] arr) throws Exception {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += arr[i];
            }catch (NullPointerException e) {
                System.out.println("Phần tử thứ " + i + "là null");
            }catch (NumberFormatException e) {
                System.out.println("Phần tử thứ" + i + "Không phải số nguyên");
            }
        }
        return sum;
    }
}
