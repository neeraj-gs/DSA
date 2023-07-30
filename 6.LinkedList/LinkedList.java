//LINKED LIST 
/* 
Linked k=lsit is like a chain if elements ,and the chani is called linkand each ele is called as node
Node has 2 parts 1.data 2.next node adress ends when next points to null


*/
public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //1.Add Ele to the first in LL
    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);

        //if ll is emoty
        if(head==null){
            head= tail=newNode;
        }
        //New node next is head
        newNode.next=head; //link
        //head = newnode
        head=newNode;
    }

    //2.Add element to thte Last in LL
    public void addLast(int data){
        //Create new node
        Node newNode = new Node(data);

        //if ll is emoty
        if(head==null){
            head= tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //We will cerate methords and not write here

        //1.Add in Linked list -- add first or add last
        //a)addFirst
        ll.addFirst(2);
        ll.addFirst(1);

        //b)addLast
        ll.addLast(3);
        ll.addLast(4);
        

    }
    
}
