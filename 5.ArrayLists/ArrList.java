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

    //7.Container with most Water
    public static void containeWithMostWater(int height[]){
        int maxw=0;
        int lp = 0;
        int rp = height.length-1;
        while(lp<rp){
            //water area
            int ht = Math.min(height[lp],height[rp]);
            int wt = rp-lp;
            int curw = ht*wt;
            maxw = Math.max(maxw,curw);


            if(height[lp]<height[rp]){
                lp++; 
            }else{
                rp--;
            }
        }
        System.out.println("Max Water Stored is: "+maxw);

    }

    //8.PairSum
    public static boolean PairSum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp)==target){
                return true;
            }else if(list.get(rp)+list.get(lp)<target){
                lp++;
            }else{
                rp++;
            }
        }
        return false;
    }

    //9.PairSum - 2
    public static boolean PairSum2(ArrayList<Integer> list,int target){
        //Finding breaking point- i , small=lp=i+1 , large=rp=i
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }else if(list.get(rp)+list.get(lp)<target){
                lp = (lp+1)%list.size();
            }else{
                rp = (list.size()+rp-1)%list.size();
            }


        }
        return false;


    }

    //10.Monotonic Array List
    public static boolean Monotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }

            if(list.get(i+1)>list.get(i)){
                dec=false;
            }
        }
        return inc||dec;
    }

    //11.FInd lonely Eleemnt
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)){
                list.add(nums.get(i));

            }
        }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }

    //12.




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
        list.add(11); //adds eleemnt 1
        list.add(15);
        list.add(6);
        list.add(8); 
        list.add(9);
        list.add(10);
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



        // **************************************                         QUESTION 6    *************************************************************
        //6.MultiDimensional Array List
        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
        // mainlist.add(list1);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // for(int i=1;i<=5;i++){
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }

        // mainlist.add(list2);
        // mainlist.add(list3);

        // System.out.println(mainlist);


    // **************************************                         QUESTION 7   *************************************************************
    //7.Container with Most Water
    //Use 2 lines from n line sin x axis to forma a container that hold maximum water
    // int height[] = {1,8,6,2,5,4,8,3,7};
    // containeWithMostWater(height);


    // **************************************                         QUESTION 8    *************************************************************
    //8.Pair Sum 1--find any pair such that the sum is equal to a target
    // System.out.println(PairSum(list,100));

    // **************************************                         QUESTION 9    *************************************************************
    //PairSum -2 : Find a pair in Sorted Rotated Array that is equal to our target
    // System.out.println(PairSum2(list, 116));

    // **************************************                         QUESTION 10    *************************************************************
    //10.Monotonic Array List or Not
    // System.out.println(Monotonic(list));


    // **************************************                         QUESTION 11    *************************************************************
    //11.Lonely Numebr or Not
    //A numebr x is lonely if (x,x+1,x-1) does not exist in the array lsit , if exists it is not lonely
    System.out.println(findLonely(list));

        
    }
}







































