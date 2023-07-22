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

    }
}



