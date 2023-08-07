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


*/

public class Queues{

    //1.Implementation of Queue usign Array
    static int arr[];
    static int size;
    static int rear;
    Queues(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }

    //IsEmoty()  Function to check if queue is empty or not
    public static boolean isEmpty(){
        return rear==-1;
    }

    //add
    public static void add(int data){
        if(rear==size-1){ //ques is full or not
            System.out.println("Queue is Full");
        }

        rear=rear+1;
        arr[rear]=data;
    }

    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i+1];
        }
        rear=rear-1;
        return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[0];
    }


    public static void main(String[] args) {
        
    }
}




