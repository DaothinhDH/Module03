package BAITAP.Sapxeptangdan;

import BAITAP.Sapxephocvien.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        students[0] = new Student(1, "Anh Đức", 7.5);
        students[1] = new Student(2, "Anh Béo", 8.5);
        students[2] = new Student(3, "Anh Huy", 9.0);

        Student [] bubbleSort1 = bubbleSort(students);
        System.out.println("Sắp xếp nổi bọt " + Arrays.toString(bubbleSort1));

        Student [] intertionSort = intertionSort(students);
        System.out.println("sắp xếp chèn " +Arrays.toString(intertionSort));

        Student [] selectionSort = selectionSort(students);
        System.out.println("Sắp xếp chọn " +Arrays.toString(selectionSort));
    }

    private static Student [] bubbleSort(Student[] students) { //Thuật toán sắp xếp nổi bọt
        int n = students.length ;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    private static Student [] intertionSort(Student[] students) { //  sắp xếp chèn
        int n = students.length;
        for (int i = 0; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        return students;
    }

    private static Student [] selectionSort(Student [] students) { // sap xep chon
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i+1; j < n; j++) {
                if (students[j].getScore() < students[indexMin].getScore()) {
                    indexMin = j;
                }
            }
            // hoán đối giá trị arr[i] và arr[indẽxMin]
            Student temp = students[i];
            students[i] = students[indexMin];
            students[indexMin] = temp;
        }
        return students;
    }

}
