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
        SpiralMatrix(arr,row,col);


    }
}



