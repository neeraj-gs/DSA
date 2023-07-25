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

    //2.Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
                }
            }
        }
        printArr(arr);
    }


    public static void main(String[] args) {
        int arr[] = {1,3,7,5,4,6};

        //1.Bubble Sort
            //Reaeatedly Swap 2 adajcent elemetns if in wrong order
            //Sorted Array after n-1 iterations [n elements]
            //Check only in unsoreted array -- till n-i , [i - iteration]
            // BubbleSort(arr);

        //2.Selection Sort
            //find the minimum elele in unsorted array and swap woth ele in beginning
            //2 loops outer - -1st to 2nd last
            //inner loop i+1 to last ele and compare if smaller swwap 
            // selectionSort(arr);
            
    }
}