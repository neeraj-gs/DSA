//ARRAY LISTS
/*
In BUilt data structure, that is linear and dynamic in size , Primitive data types cant be stored directly
Array klist is a  calss in java

Implementation of Array Lists
    When we define some array list in java , in memory an array is created with some fixed size by default
    as the array is full , java automatically doubles the size of array intrenally to store more data
    
    Older eleemtns are copied in new array and new elements are added and old aray list is deleted
    by gabage collector automatically
    


*/
import java.util.*;
public class ArrList{


    //1.Print reverse of an Array lIst
    public static void printRev(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

    //4.Minimum and Maximum in an Array list
    public static void MinMax(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("Miimum Eleemnt is: "+list.get(0)+" and Maximum ele is: "+list.get(list.size()-1));
    }

    //5.Swap 2 elements inArray List
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

        System.out.println("List After Swap: "+list);
    }
    public static void main(String[] args) {

    // **************************************                         QUESTION 1    *************************************************************
        ArrayList<Integer> list = new ArrayList<>(); //creation or initialisation of Array List
        //<>  is used so that tht data type is stored only

        //Operations in Array  List
        //1.Add -- O(1) --
        // list.dd(1); //adds eleemnt 1
        // list.add(2);
        // list.add(3);
        // list.add(4); 
        // list.add(5);
        // list.add(6);

        // System.out.println(list);

        //2.Get -- O(1) pass index and we get thte eleemnt
        // list.get(2); //-- we get 3 as output


        //3.Remove por delete -- pass index and elee at that index is deelted
        //O(n)
        // list.remove(1);

        //4.Set element at index --O(n)
        //pass index and the value to be stored at that index
        // list.set(2,10); //

        //5.Contains element
        //check if elee is present in array kist or not
        // list.contains(1); //we pass ele if presetn then true else false is returned

        //6.Add at index
        // list.add(1,9); //takes index and value at that index and in that index that is added all elee are pushed back
        //O(n)

        //7.Size of an array list
        // list.size(); //gives the size of list


        // **************************************                         QUESTION 2    *************************************************************
        //2.PRINT REVERSE OF ARRAY LSIT
        list.add(1); //adds eleemnt 1
        list.add(2);
        list.add(7);
        list.add(5); 
        list.add(10);
        list.add(6);
        // printRev(list);


        // **************************************                         QUESTION 3    *************************************************************
        //3.Sorting of an array lsit
        // Collections.sort(list); //to sort in ascending order
        // System.out.println(list);;
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);


        // **************************************                         QUESTION 4    *************************************************************
        //4.FInd maximum and minimum element in Array LIsr
        // MinMax(list);


        // **************************************                         QUESTION 5    *************************************************************
        //5.Swap 2 Numbers
        // System.out.println("List Before Swap: "+list);
        // swap(list,0,3);



        
    }
}







































