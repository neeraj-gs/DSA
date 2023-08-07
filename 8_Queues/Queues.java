//Queue Data Structure
/*
[Fifo]First in First out Data structure
There are 2 pointers front and rear pointers pointing to start and end of queue
exit - front pointer
entry -rear pointer

OPerations
    1.Add - 0(1) -- Enqueue -- add to rear
    2.Remove - O(1) - Dequeue -- remove elements from firs to front pointer
    3.Peek - O(1) - Pesent element - front pointer

IMplementation of Queues
    1.Arrays -- fixed size(n) , remove-O(n) , we will not impleemtn queue using array
        We can implement Circular Queue using Arrays

    2.Linked List 
    3.Stacks




public class Queues{

    //1.Implementation of Queue usign Array
    // static int arr[];
    // static int size;
    // static int rear;
    // Queues(int n){
    //     arr=new int[n];
    //     size=n;
    //     rear=-1;
    // }

    // //IsEmoty()  Function to check if queue is empty or not
    // public static boolean isEmpty(){
    //     return rear==-1;
    // }

    // //add
    // public static void add(int data){
    //     if(rear==size-1){ //ques is full or not
    //         System.out.println("Queue is Full");
    //     }

    //     rear=rear+1;
    //     arr[rear]=data;
    // }

    // //remove
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Empty Queue");
    //         return -1;
    //     }
    //     int front = arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i] = arr[i+1];
    //     }
    //     rear=rear-1;
    //     return front;
    // }

    // //peek
    // public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Empty");
    //         return -1;
    //     }
    //     return arr[0];
    // }


    //IMPLEMETNATION OF CIRCULAR QURUE USING ARRAYS
    static int arr[];
    static int size;
    static int rear;
    static int front;

    Queues(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;
    }

    //IsEmoty()  Function to check if queue is empty or not
    public static boolean isEmpty(){
        return rear==-1&&front==-1;
    }

    public static boolean isFull(){
        return (rear+1)%size == front;
    }

    //add
    public static void add(int data){
        if(isFull()){ //ques is full or not
            System.out.println("Queue is Full");
        }
        if(front==-1){
            front =0;
        }

        rear=(rear+1)%size;
        arr[rear]=data;
    }

    // remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }

        int res = arr[front];

        //if only one ele is present
        if(rear==front){
            rear=front=-1;
        }else{

        front= (front+1)&size;}

        return res;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }

    //Print Queue
    public static void printQueue(){
        while(!isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }


    //4.Quee using Linked list
    static class Node{
        int data;
        Node next;

        Node(data){
            this.data=data;
            this.next=null;
        }
    }
    
    static Node head=null;
    static Node tail = null;

    public static boolean isEmpty(){
        return head==null && tail==null;
    }

    //add
    public static void add( int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    //reomve
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int front=head;
        if(head ==tail){
            tail=head=null;
        }else{
            head = head.next;
        }

        return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }







    //Print Queue
    public static void printQueue(){
        while(!isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }


    public static void main(String[] args) {
        //Print Quwue
        printQueue();

        //3.Circluar queue using Arrays
        /*
            Circular Queue
            When we remove a ele from front , front becomes next ele
                Earlier we used to shift all ele front
            rear=(rear+1)%size
            front = (f+1)%size
        

        //4.Queue using Linked List

        
    }
}
*/


//IMPORTANT QUESTIONS
import java.util.*;
import java.util.LinkedList;
public class Queues{
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>(); // We created as Linked list because queu is an interface
        //We cant create objects of an interface
        //to implemetn que we can implemetn it using arrayLDeque or Linked lIst fo rqueus
        //No own obwjct o fqueue is possible
        
    }
}


