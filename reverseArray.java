// Q.Reverse an array (in-place or using extra space).

import java.util.Scanner;

public class reverseArray {

    public static void ReverseArray(int []arr,int n,int element){
        for(int i=0;i<element/2;i++){

            int temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
        }
        System.out.println("Array After Reversing: ");
        for(int i=0;i<element;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements: ");
        int element = sc.nextInt();
        int[] arr = new int[element];

        for (int i = 0; i < element; i++) {
            arr[i]=sc.nextInt(); // 1 2 3 4 5
        }
        System.out.println("Array Before Reversing: ");
        for(int i=0;i<element;i++){
            System.out.println(arr[i]+" ");
        }
        int n = arr.length;
    ReverseArray(arr,n,element);
    }
}