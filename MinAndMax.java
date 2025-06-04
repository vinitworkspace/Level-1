// Q.Find the maximum and minimum element in a 1D/2D Array.

import java.util.Scanner;

public class MinAndMax {

    public static void MaximumNumber_1D(int[] a, int len) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum Number In Given Array Is: " + max);
    }

    public static void MinimumNumber_1D(int[] a, int len) {
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Number In Given Array Is: " + min);
    }

    public static void Both_1D(int[] a, int len) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Number In Given Array Is: " + min);
        System.out.println("Maximum Number In Given Array Is: " + max);
    }

    public static void MaximumNumber_2D(int[][] a, int row, int col) {

        int max = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Maximum Number In Given Array Is: " + max);
        return;
    }

    public static void MinimumNumber_2D(int[][] a, int row, int col) {
        int min = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Minimum Number In Given Array Is: " + min);
        return;
    }

    public static void Both_2D(int[][] a, int row, int col) {

        int max = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        int min = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Minimum Number In Given Array Is: " + min);
        System.out.println("Maximum Number In Given Array Is: " + max);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 1D Array\n2. 2D Array");
        System.out.print("Select Any One: ");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                while (true) {
                    System.out.println("\n1. Maximum Number\n2. Minimum Number\n3. Both");
                    System.out.println("Select Any One: ");
                    int choice = sc.nextInt();
                    System.out.print("Enter Number Of Elements In Array: ");
                    int n = sc.nextInt();
                    int[] a = new int[n];
                    int len = a.length;
                    System.out.println("Enter Elements: ");
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }

                    switch (choice) {
                        case 1 -> MaximumNumber_1D(a, len);
                        case 2 -> MinimumNumber_1D(a, len);
                        case 3 -> Both_1D(a, len);
                    }
                }
            }
            case 2 -> {
                while (true) {
                    System.out.println("\n1. Maximum Number\n2. Minimum Number\n3. Both");
                    System.out.println("Select Any One: ");
                    int choice = sc.nextInt();
                    System.out.println("Enter Number Of Rows In Array: ");
                    int row = sc.nextInt();
                    System.out.println("Enter Number Of Columns In Array: ");
                    int col = sc.nextInt();

                    int[][] a = new int[row][col];
                    System.out.println("Enter The Elements: ");
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

                    switch (choice) {
                        case 1 -> MaximumNumber_2D(a, row, col);
                        case 2 -> MinimumNumber_2D(a, row, col);
                        case 3 -> Both_2D(a, row, col);
                    }
                }
            }
        }

    }

}
