//BASIC TO ADVANCED ARRAY QUESTIONS
import java.util.*;
public class Arr{

    //1.Printing of Array Elements
    public static void printArray(int arr[]){
        System.out.print("The Eleemtns of Array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //2.Linear Search
    public static int LinSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //3.Binary Search
    public static int BinSearch(int arr[],int key){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

    //4.Minimum and Maximum Elemetn in Array
    public static void MinMax(int arr[]){
        Arrays.sort(arr);
        System.out.println("Maximum Element is: "+arr[arr.length-1]+" and the Minimum Eleemtn is: "+arr[0]);
    }

    //5.Reverse an Array:
    public static void RevArr(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            //swap
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e]=temp;

            s++;
            e--;


        }
        printArray(arr);
    }

    //6.Pairs in Array
    public static void Pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int arr2[] = {1,2,5,6,8,}; //A way to create an array

        /*  *******************************************       Question : 1                 ************************************************* */
        //1.Creation , Insertion and input of Array
        System.out.print("Enter the Size of Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elementa of Arrray: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        printArray(arr);


        /*  *******************************************       Question : 2                 ************************************************* */
        //2.Linear Search
        // System.out.print("Enter Key to Search: ");
        // int key =s.nextInt();
        // System.out.println("Key found at index: "+LinSearch(arr,key));



        /*  *******************************************       Question : 3                 ************************************************* */
        //3.Binary Search
        //ONly condition to apply binary search the eleemtns have to be sorted
        // System.out.println("Key found at index: "+BinSearch(arr,key));


        /*  *******************************************       Question : 4                 ************************************************* */
        //4.Largest and Smallest Element in Array
        // MinMax(arr);

        /*  *******************************************       Question : 5                 ************************************************* */
        //5.Reverse an Array
        // RevArr(arr);

        /*  *******************************************       Question : 6                 ************************************************* */
        //6.Pairs in Array
        // Pairs(arr);


        /*  *******************************************       Question : 7                 ************************************************* */

    }
}

















