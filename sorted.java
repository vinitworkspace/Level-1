// 4.Check if a 1D array is sorted..

import java.util.*;
public class sorted{
      public static void checkSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            } else if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("Array is sorted in Ascending order ");
        } else if (descending) {
            System.out.println("Array is sorted in descending order ");
        } else {
            System.out.println("Array is not sorted");
        }


    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter value of array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
     checkSorted(arr);
    

    }
}
