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

    //3.Insertion Sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while(arr[j]>curr && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        printArr(arr);
    }

    //4.Count SOrt
    public static void countSort(int arr[]){
        //FInd max ele in array
        int k=arr[0];
        for(int i=0;i<arr.length;i++){
            k=Math.max(k,arr[i]);
        }

        //count of each elelemt
        int count[] = new int[k];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }


        for(int i=1;i<=count.length;i++){
            count[i]+= count[i-1];
        }

        int output[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // count[arr[i]] = count[arr[i]]-1;
            output[count[arr[i]]] = output[count[arr[i]]]-1;
        }


        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
        printArr(arr);


    }


    public static void main(String[] args) {
        int arr[] = {1,3,2,3,4,1,6,4,3};

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

        //3.Insertion Sort
            //insert an ele from unsorted array to its correct position in sorted array
            // insertionSort(arr);

        //4.Count SOrt
            //find count of every distinct ele
            //calculate position of every elee in sorted array
            // countSort(arr);
            
    }
}