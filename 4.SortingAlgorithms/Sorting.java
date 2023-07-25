//All Sorting Algorithms
public class Sorting{
    //Print Array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //1.Bubble Sort
    public static void BubbleSort(int arr[]){
        int c = 1; //for iterations
        while(c<arr.length-1){
            for(int i=0;i<arr.length-c;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            c++;
        }
        printArr(arr);

    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,5,4,6};

        //1.Bubble Sort
            //Reaeatedly Swap 2 adajcent elemetns if in wrong order
            //Sorted Array after n-1 iterations [n elements]
            //Check only in unsoreted array -- till n-i , [i - iteration]
            BubbleSort(arr);
            
    }
}