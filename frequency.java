// 9. Count the frequency of each element in a 1D array
import java.util.*;
public class frequency{
    public static void countfreq(int[] arr){
         boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }
            System.out.println("Elemet "+arr[i] + " : Frequency is  " + count );

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
      countfreq(arr);
     
     }
}
