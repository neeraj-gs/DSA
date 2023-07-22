// /2D ARRAYS ALL BASIC TO INTERMIDIATE QUESTIONS
import java.util.*;
public class Matrix{

    //1.Print Matix
    public static void PrintMatrix(int arr[][],int row,int col){

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    //2.Print SPiral Matrix
    public static void SpiralMatrix(int arr[][],int row,int col){
        int sr=0;
        int sc=0;
        int er=row-1;
        int ec=col-1;
        while(sr<=er && sc<=ec){
            //top
            for(int i=sc;i<=ec;i++){
                System.out.print(arr[sr][i]+" ");
            }

            //right
            
            for(int j=sr+1;j<=er;j++){
                System.out.print(arr[j][ec]+" ");
            }

            //bottom
            for(int i=ec-1;i>=sc;i--){
                if(sc==ec){
                    return;
                }
                System.out.print(arr[er][i]+" ");
            }

            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sr==er){
                    return;
                }
                System.out.print(arr[i][sc]+" ");

            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    //3.Diagnol Sum
    public static int DiagSum(int arr[][],int row,int col){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            //pd
            sum+=arr[i][i];
            
            //sd
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }


    //4.staircase Search
    public static boolean staircaseSearch(int arr[][],int key){
        int row=0;
        int col = arr[0].length-1;
        while(row<arr.length&&col>=0){
            if(arr[row][col]==key){
                System.out.print("Key Found at index: "+row+" , "+col);
                return true;
            }

            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("Key Not Found: ");
        return false;
    }

    //5.Count number of times a number has occured
    public static int countN(int arr[][],int key){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    c++;
                }
            }
        }
        return c;
    }

    //6.Count the Sum of numebrs of Nth row
    public static int countSum(int arr[][],int row){
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s+=arr[row][i];

        }
        return s;
    }

    //7.Transpose of a Matrix
    public static void transpose(int arr[][]){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // *******************************************************************************                Question 1 *                        ***************************************************************************************************
        //1.Creation , INsertion and Updation
        System.out.print("Enter the Numebr of Rows and Columns of Matrix: ");
        //Take the input of numebr of rows and Columns
        int row = s.nextInt();
        int col = s.nextInt();
        
        //INitialise the Matrix
        int arr[][] = new int[row][col];
        System.out.print("Enter the Elements of Matric Row-Wise: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = s.nextInt(); //the same is used for updation
            }
        }
        PrintMatrix(arr, row, col);

        // *******************************************************************************                Question 2 *                        ***************************************************************************************************
        //2.Spiral Matrix
        // SpiralMatrix(arr,row,col);


        // *******************************************************************************                Question 3 *                        **************************************************************************************************
        //3.Diagnol Sum of a Matrix
        //Sum of both principal and secondary diagnol
        //System.out.println(DiagSum(arr,row,col));//


        // *******************************************************************************                Question 4 *                        **************************************************************************************************
        //4.Search in A Sorted Matrix
        //We will use Staircase serach Pattern 
        // staircaseSearch(arr, 10);
        //if(n>>>>>m) or (m>>>>>>n) -- O(N+M)


        // *******************************************************************************                Question 5 *                        **************************************************************************************************
        //5.Print number of 7's in 2d Array:
        // System.out.println(countN(arr,7));

        // *******************************************************************************                Question 6 *                        **************************************************************************************************
        //6.Pritn the sum of numbers in nth row of matrix
        // System.out.println(countSum(arr,1));

        // *******************************************************************************                Question 7 *                        **************************************************************************************************
        //7.Transpose of a Matrix
        transpose(arr);


    }
}



