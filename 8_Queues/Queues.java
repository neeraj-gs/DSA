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

    //5.IMplementaion of Queue usign 2 stacks
//   static class Queue{
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();

//     public static boolean isEmpty(){
//         return s1.isEmpty();
//     }

//     //O(N)
//     public static void add(int data){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }

//     public static int remove(){
//         if(s1.isEmpty()){
//             System.out.println("Quwuw is Empty");
//             return -1;
//         }
//         return s1.pop();
//     }

//     //peek
//     public static int peek(){
//         if(s1.isEmpty()){
//             System.out.println("Quwuw is Empty");
//             return -1;
//         }
//         return s1.peek();
//     }


//   }  

  static class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void push(int data){
        if(!q1.is)
    }



  }



    public static void main(String[] args) {

        //1.Queue implementation USing JCF

        // Queue<Integer> q= new LinkedList<>(); // We created as Linked list because queu is an interface
        // //We cant create objects of an interface
        // //to implemetn que we can implemetn it using arrayLDeque or Linked lIst fo rqueus
        // //No own obwjct o fqueue is possible

        // q.add(1);
        // q.add(2);
        // q.add(3);


        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //2.Queue using 2 stacks
        /*
        2 ways
        1.Push can be made O(n) and remove and pop in O(1)
        2.Pop & peek can be made O(n) and push using O(1)

        1.Push - O(n)
            Define 2 Stacks
            Add Ele in s1 if empty , if  not empty transfer all ele from s1 to s2 , add ele on s1 and then transfer ele back to s1
            Remove ele - -remove from s1
        */
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        //3.Stack using 2 Queus
        /*
        2 ways push in O(n) or pop is O(n) and others need not require them
        we will implemetn pop -o(n)

        push - push eleemnts into non-empty q1 , --O(1)
        pop - Transfer all eleement sfrom q1 to q2 till we have only 1 ele present , till we get top and return top
        no ned to trasfer back to another q
        */



    }
}



