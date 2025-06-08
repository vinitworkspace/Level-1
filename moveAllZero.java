// 8.Move all zeros to the end of a 1D array (order preserved)
import java.util.*;
public class moveAllZero{
    public static void moveAllZero(int[] arr){
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }

        
        System.out.print("After moving zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of 1D array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       System.out.println("Enter value of 1D array including 0 element");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      moveAllZero(arr);
      }

}