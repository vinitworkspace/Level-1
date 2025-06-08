// 5.Remove duplicates from a sorted 1D array.
import java.util.*;
public class duplicate{
    public static void removeDuplicate(int[] arr){
      boolean ascending=true;

      for(int i=0;i<arr.length-1;i++){
      if (arr[i] > arr[i + 1]) {
              ascending = false;
              break;
      }
      }

      if(!ascending){
        System.out.println("please enter sorted array in ascending order");
        return;
      }
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        int newLength=j+1;
         System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
      
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of 1D array");
       int n=sc.nextInt();
       int arr[]=new int[n];
        System.out.println("Enter the value of array in ascending order ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      removeDuplicate(arr);
    }
}