//BASIC TO ADVANCED ARRAY QUESTIONS
import java.util.*;
public class Arr{
    public static void printArray(int arr[]){
        System.out.print("The Eleemtns of Array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int arr2[] = {1,2,5,6,8,}; //A way to create an array
        System.out.print("Enter the Size of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elementa of Arrray: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        printArray(arr);

    }
}

















