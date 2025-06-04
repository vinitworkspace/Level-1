
// 3.Sum of all elements in a 1D/2D array.
import java.util.*;

public class SumOfArray {

    public static void Sum_1D(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum Of Elements In 1D Array is : " + sum);
    }

    public static void Sum_2D(int[][] a, int row, int col) {
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum Of Elements In 2D Array is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 1D Array\n2. 2D Array");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter Number Of Elements in Array: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                int len = a.length;

                System.out.println("Enter Elements For 1D Array: ");
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println("1D Array: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                Sum_1D(a, n);
            }
            case 2 -> {
                System.out.println("Enter Number Of Rows: ");
                int row = sc.nextInt();
                System.out.println("Enter Number Of Columns: ");
                int col = sc.nextInt();

                int[][] a = new int[row][col];

                System.out.println("Enter Elements For 2D Array: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }

                System.out.println("2D Array: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }

                Sum_2D(a, row, col);
            }
        }

    }
}