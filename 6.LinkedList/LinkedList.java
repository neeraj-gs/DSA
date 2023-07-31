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
    public static int size;

    //1.Add Ele to the first in LL
    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

        //if ll is emoty
        if(head==null){
            head= tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }

    //3.Print a Linked list
    public void Printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //4.Add element in the Middle
    public void addMid(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(temp!=null && i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        

    }

    //6.Remove first eleemnt in Linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val = head.data;
        head=head.next;
        size--;
        return val;

    }

    //7.Remove last elemetn in Linked list
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val = tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }


    //8.Iteratino Search in Linked List
    public int iterSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //9.Recursive Search in Linked List
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //10.Reverse a Linked list
    public void revLL(){
        Node prev=null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;


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
        
        //3.Print a LL
        // ll.Printll();

        //4.Add in the Middle of Linked List
        ll.addMid(2,5); 
        ll.Printll();

        //5.Size of LL
        System.out.println(size);

        //6.Remove OPerations
        //removeFirst
        // ll.removeFirst();

        //7.Remove Last
        // ll.removeLast();

        //8.Iterative Srarch
        System.out.println(ll.iterSearch(2));

        //9.Recursive Search
        System.out.println(ll.recSearch(3));

        //10.Reverse a Linked List
        ll.revLL();



    }
    
}
