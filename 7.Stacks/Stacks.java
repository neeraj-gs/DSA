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
    // static ArrayList<Integer> list = new ArrayList<>();
    // public static boolean isEmpty(){
    //     return list.size()==0;
    // }

    // //push
    // public static void push(int data){
    //     list.add(data);

    // }

    // //pop
    // public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }

    //     int top = list.get(list.size()-1);
    //     list.remove(list.size()-1);
    //     return top;
    // }

    // //peek
    // public static int peek(){
    //     return top = list.get(list.size()-1);
    // }

    //2.IMplementation suing lInke dlist
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head = null;

    //isEMpty
    public static boolean isEmpty(){
        return head==null;
    }

    //push 
    public static void push(int data){
        Node newNode = new Node(1);
        if(isEmpty()){
            head=newNode;
        }
        
        newNode.next=head;
        head=newNode;
    }

    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head=head.next;
        return top;

    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
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

        //3.Implementation of Stack Using Linked List

    }
}