package Homework.Task24;
// Создать двухмерный квадратный массив и заполнить его "бабочкой", то есть таким образом:
/*
 11111
 01110
 00100
 01110
 11111
 */

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = 1; //head
                arr[n - i - 1][j] = 1; //down
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
