// 10.Merge two sorted 1D array into one sorted array
import java.util.*;
public class merge{
    public static void mergeArray(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        System.out.println("Merged array is :");
       for(int m=0;m<arr1.length+arr2.length;m++){
        System.out.print(merged[m]+ " ");
       }
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of first 1D array");
       int n=sc.nextInt();
       int arr1[]=new int[n];
       
        System.out.println("Enter the value of first array");
        for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
      }
       System.out.println("Enter size of second 1D array");
       int n2=sc.nextInt();
       int arr2[]=new int[n2];
       System.out.println("Enter the value of second array");
        for(int i=0;i<n2;i++){
        arr2[i]=sc.nextInt();
      }
      mergeArray(arr1,arr2);
    }
}