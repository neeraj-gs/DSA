//BASIC TO ADVANCED ARRAY QUESTIONS
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
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

    //7.SubArrays
    public static void SubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
            }
            System.out.println();
        }
    }


    //8.Kadanes Algorithm
    public static int Kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int neg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs <0){
                cs = 0;
                neg = Math.max(neg,arr[i]);
            }
            ms = Math.max(ms,cs);
        }
        if(ms ==0 && neg!= Integer.MIN_VALUE){
            return neg;
        }

        return ms;

    }

    //9.TRAPPING RAIN WATER IN ARRAY
    public static int trapRainWater(int arr[]){
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int waterlevel = 0;
        int trappedWater = 0;
        for(int i=0;i<arr.length;i++){
            waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterlevel - arr[i];
        }
        return trappedWater;

    }

    //10.Best time to buy and sell stocks
    public static int stocks(int arr[]){
        int bp = Integer.MAX_VALUE;
        int maxp =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>bp){
                int p = arr[i] - bp;
                maxp = Math.max(maxp, p);
            }else{
                bp=arr[i];
            }
        }
        return maxp;
    }


    //11.Find Duplicate in An Array
    public static boolean Dup(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]==arr[e]){
                return true;
            }
            e--;
        }
        return false;
    }

    //12.Rotated Sorted Array
    public static int RotSortArr(int arr[],int target){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int m = (s+e)/2;
            if(target == arr[m]){
                return m;
            }
            else if(arr[s]<=arr[m]){
                if(target>=arr[s]&&target<arr[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{
                if(target >arr[m]&& target<=arr[e]){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
        }
        return -1;
    }



    //13.Triplets of array satisfying a COndition
    public static List<List<Integer>> triplets(int arr[]){
        List<List<Integer>> res = new ArrayList <List<Integer>>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((i!=j ||j!=k || k!=i) && (arr[i]+arr[j]+arr[k]==0)){
                        
                    }
                }
            }
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
        //7.Sub Arrays
        // SubArrays(arr);

        /*  *******************************************       Question : 8                 ************************************************* */
        //8.Kadanes Algorithm - -Used to find the Maximum Sub Array SUm in an Array
        // Kadanes(arr);

        /*  *******************************************       Question : 9                 ************************************************* */
        //9.Trapping Rain water
        // System.out.println("Trapped Rain Water is: "+trapRainWater(arr));


        /*  *******************************************       Question : 10                 ************************************************* */
        //10.Best time to buy and sell Stocks
        // System.out.println("The Maximum Profit Acheived is: "+stocks(arr));


        /*  *******************************************       Question : 11.                 ************************************************* */
        //11.Find Duplicate in Array
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        // System.out.println(Dup(arr));


        /*  *******************************************       Question : 12                 ************************************************* */
        //12.Rotated Sorted Array
        //Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums
        // int target = 5;
        // System.out.println("The target eleemtn is found at Index: "+RotSortArr(arr,target));


        /*  *******************************************       Question : 13                 ************************************************* */
        //13.Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets
        //13.FInd the Triplets
        // System.out.print(triplets(arr));


    }
}

















