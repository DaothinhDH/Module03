package BAITAP.Sapxepdoibong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  static  List<FootballTeam> teams = new ArrayList<>();
    public static void main(String[] args) {
        teams.add(new FootballTeam(1, "Manchester United", 11, 80));
        teams.add(new FootballTeam(2, "Manchester City", 15, 99));
        teams.add(new FootballTeam(3, "Liverpool", 8, 70));
        System.out.println("Mảng khi chưa sắp xếp" + teams);
        bubbleSort();
        System.out.println("Sắp xếp nổi bọt " + teams);
        insertionSort();
        System.out.println("Sắp xếp chèn " +teams);
        selectionSort();
        System.out.println("Sắp xếp chọn " +teams);


    }

    private static void bubbleSort() { //Thuật toán sắp xếp nổi bọt
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    FootballTeam temp = teams.get(j);
                    teams.set(j, teams.get(j + 1));
                    teams.set(j + 1, temp);
                }
            }
        }
    }

    private static void insertionSort() { //  sắp xếp chèn
        int n = teams.size();
        for (int i = 1; i < n; i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j--;
            }
            teams.set(j + 1, key);
        }
    }

    public static void selectionSort() {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int indexMax = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(indexMax).getScore()) {
                    indexMax = j;
                }
            }
            FootballTeam temp = teams.get(i);
            teams.set(i, teams.get(indexMax));
            teams.set(indexMax, temp);
        }
    }


}
