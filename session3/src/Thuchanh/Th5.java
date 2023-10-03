package Thuchanh;
// tìm giá trị nhỏ nhất
public class Th5 {
    public static void main(String[] args) {
        int [] arr = {4,12,7,8,9,10,11,};
        int index = minValue(arr);
        System.out.println("Gía trị nhỏ nhất trong mảng là: " +arr[index]);
    }

    public static int minValue(int[]array){
        int index = 0;
        for(int i = 1; i < array.length;i++){
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }

}

