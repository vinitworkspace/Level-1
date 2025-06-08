// 7.Find second largest/smallest element in 1D array
import java.util.*;
public class secLarSmall{
    public static void SecLargest(int[] arr){
        int max=arr[0];
        int secMax=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secMax=max;
                max=arr[i];
            }
             else if(arr[i]>secMax && arr[i] !=max){
                secMax=arr[i];
            }
        }
        System.out.println("second largest element is "+secMax);
    }
    public static void SecSmallest(int[] arr){
         int min=arr[1];
        int secMin=arr[0];  
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                secMin=min;
                min=arr[i];
            }
             else if(arr[i]<secMin && arr[i] !=min){
                secMin=arr[i];
            }
        }
        System.out.println("second smallest element is "+secMin);
        

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of 1D array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       System.out.println("Enter value of 1D array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      SecLargest(arr);
      SecSmallest(arr);

}
}