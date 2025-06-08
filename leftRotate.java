// 6. Left rotate a 1D array by k positions
// 6. Left rotate a 1D array by k positions
import java.util.*;
public class leftRotate{
    public static void leftRotate(int[] arr,int k){
        for(int i=0;i<k;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }

        System.out.println("after rotating :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
      System.out.println("Enter K point");
      int k=sc.nextInt();
      leftRotate(arr,k);
}
    }
