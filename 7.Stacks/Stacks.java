//Stacks Data Structure
/*
Stack - Last in First Out
3 Operations --O(1)
    1.Push - Adding data from top 
    2.Pop  - Removing ele from top
    3.Peek - Top Element of Stack

    Implementation of Stacks -- Arrays,Array Lsit and Lined List






*/

import java.util.*;

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


    //4.Push at bottom of Stack
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //6.Reverse  a string
    public static void revString(String str){
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            res.append(curr);
        }
        str = res.toString();
        System.out.println(str);
    }

    //7.Reverse a Stack
    public static void revStack(Stack<Integer> s){
        while(!s.isEmpty()){
            return;
        }

        int top = s.pop();
        revStack(s);
        pushAtBottom(s,top);

    }


    //8.Stock Span Problem
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int curr=stocks[i];
            while(!s.isEmpty() && curr>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevhigh=s.peek();
                span[i] = i-prevhigh;
            }
        }
    }

    // //9.Next Greater Element Without Circulation fo Array
    // public static void nextGreaterEle(int arr[]){
    //     int nge[] = new int[arr.length];
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=2*arr.length-10;i>=0;i--){
    //         while(!s.isEmpty() && s.peek()<=arr[i]){
    //             s.pop();
    //         }
    //         if(i<arr.length){
    //             if(!s.isEmpty()){
    //                 nge[i] = s.peek();
    //             }else{
    //                 nge[i]=-1;
    //             }
    //         }
    //         s.push(arr[i]);
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         System.out.println("The next greater Ele for "+arr[i]+" is "+nge[i]);
    //     }
    // }


    //10.Next Greater Element Without Circulation fo Array
    public static void nextGreaterEle(int arr[]){
        int nge[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=2*arr.length-10;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i%arr.length]){
                s.pop();
            }
            if(i<arr.length){
                if(!s.isEmpty()){
                    nge[i] = s.peek();
                }else{
                    nge[i]=-1;
                }
            }
            s.push(arr[i%arr.length]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("The next greater Ele for "+arr[i]+" is "+nge[i]);
        }
    }

    //11.Valid PArentheses
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                //pair
                if( (s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
                    s.pop();

                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // /12.Duplicate parentheiss
    public static boolean duplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //opeing,operator ,operands
            
            //clsing
            if(ch==')'){
                int c=0;
                while(!s.isEmpty()&&s.peek()!='('){
                    //if valid string no need to check emoty or not also
                    s.pop();
                    c++;
                }
                if(c<1){
                    return true;
                }else{
                    s.pop();
                }

               
            }
             else{
                    //openig condition
                    s.push(ch);
                }
        }
        return false;
    }
    

    public static void main(String[] args) {
        //1.Implement Stack Using Array Lists
        // Stacks s = new Stacks();
        
        
        //2.Printing in Stack
        // while(!isEmpty()){
        //     System.out.println(s.peek());
        //     // s.pop();
        // }

        //3.Implementation of Stack Using Linked List

        //4.Java Colection FRameworks
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // while(!isEmpty()){
        //     System.out.println(s.peek());
        //     // s.pop();
        // }


        //5.Push at the Bottom of Stack
        // Stack<Integer> s =new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s,4);
        // while(!isEmpty()){
        //     System.out.println(s.pop());
        //     // s.pop();
        // }

        //6. Reverse a String suing Stack
        //just add it and then remove it we get the elemens in reverse order
        // String str ="abc";
        // revString(str);


        //7.Reverse a Stack
        // revStack(s);


        //8.Stock Span Problem
        //Maximum number of Consecutive days for which the price<= todays price
        //need to find span , some bar cahrt wuth each day value is f=given
        /*
        To find span
            1st day span is 1
            fir next days , check curr and prev highest and prev highest is take
        For a givven ele , check and calculate span of each elemtn
            Span = index - prevHighindex

            Approach:
            In Stack we store index of Prev HIgh nad a span aray to store span
            Pop all elemnts that is greater than curr index
            push index after finding span , dont pop if prevhigh is grrater than curr
            As stack is empty - span=i+1;


        */
        // int stocks[] = {100,80,60,79,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks,span);

        //9.Next greater Element
        //1st Variant No Circular 
        /*An aray of n eleemnts is given we need ot find the next greater ele for all indeices
        Define a stack , Iterate form last ele in array ,
        check if there is any elemetns less tahtn index in stack ,
            if there is an ele less than index -- pop 
            else tos is next greater elel of index and then  push index to stack
        */
        int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};
        nextGreaterEle(arr);

        //2nd Variant With Circulation
        /* 
        We need to check entire array in circular way
        Copy paste same array numbers then check from right we get the circulat answer
        to implement circular array -- (i%n) is the only one we have ot do it 

        */

        //11.Valid Parenthesis
        /*
        Define a Stack , Move in String from start to end
        If Openig bracket - push on stack
        if Closing bracket
            if stack top is a pair then Pop it
            else it is not a valid parenthesis
        At end stack has to be empty then valid , if not not valid


        */

        String str = "({})[]";
        isValid(str);

        //12.Duplicate Parenthesis
        /*
        Given a  Balanced Expression , find if it contains duplicate parentheses or not
        A set of parentheses are duplicate if same subedpresion is surronded by multiple parenthesis

        Approach:
        Define a stack to keep track of brackets
        count items between closing andopening id no items , no duplicate
            Push Opening Brackets into stack
            WHen we see a closing bracket , initialise count =0 and then count charecters till its p
                pair is matched and count++;
            if c<1 -- duplicate - return true
            I fno closing pair - pop
        */
        duplicate(str);




    }
}