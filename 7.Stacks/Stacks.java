//Stacks Data Structure
/*
Stack - Last in First Out
3 Operations --O(1)
    1.Push - Adding data from top 
    2.Pop  - Removing ele from top
    3.Peek - Top Element of Stack

    Implementation of Stacks -- Arrays,Array Lsit and Lined List






*/

import java.util.ArrayList;

public class Stacks{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }

    //push
    public static void push(int data){
        list.add(data);

    }

    //pop
    public static int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //peek
    public static int peek(){
        return top = list.get(list.size()-1);
    }

    public static void main(String[] args) {
        //1.Implement Stack Using Array Lists
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        
        //2.Printing in Stack
        while(!isEmpty()){
            System.out.println(s.peek());
            // s.pop();
        }
    }
}