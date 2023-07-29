//ARRAY LISTS
/*
In BUilt data structure, that is linear and dynamic in size , Primitive data types cant be stored directly
Array klist is a  calss in java
*/
import java.util.*;
public class ArrList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //creation or initialisation of Array List
        //<>  is used so that tht data type is stored only

        //Operations in Array  List
        //1.Add -- O(1) --
        list.add(1); //adds eleemnt 1
        list.add(2);
        list.add(3);

        System.out.println(list);

        //2.Get -- O(1) pass index and we get thte eleemnt
        list.get(2); //-- we get 3 as output


        //3.Remove por delete -- pass index and elee at that index is deelted
        //O(n)
        list.remove(1);

        //4.Set element at index --O(n)
        //pass index and the value to be stored at that index
        list.set(2,10); //

        //5.Contains element
        //check if elee is present in array kist or not
        list.contains(1); //we pass ele if presetn then true else false is returned

        //6.Add at index
        list.add(1,9); //takes index and value at that index and in that index that is added all elee are pushed back
        //O(n)

        //7.Size of an array list
        list.size(); //gives the size of list
        

        
    }
}







































