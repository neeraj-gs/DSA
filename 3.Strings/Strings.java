//STRINGS ALL BASIC TO INTERMIDIATE QUETIONS

import java.util.*;
public class Strings{

    //2.Check if the strign is palindromw or not
    public static boolean Palindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                System.out.println("Not a Palindrome");
                return false;
            }

            s++;
            e--;
        }
        System.out.println("IT is a Palindrome");
        return true;
    }

    //3.Finding shortest path given Directions
    public static float shortestPath(String str){
        float x=0;
        float y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        float X = x*x;
        float Y = y*y;
        return (float)Math.sqrt(X+Y);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //**********************************************                          QUESTION 1                           ************************************************8*/
        //1.CREATION , Input , Output and Built-in String Functions
        System.out.print("ENter teh String: ");
        String str = s.nextLine();
        System.out.println("String entered is: "+str);
        // String str = "STR";
        // String str = new String("str"); //These 2 are other ways to Enter String

        System.out.println("Length of String is: "+str.length()); //we also use concatenation in every rint str1+str2 = concatenation
        System.out.println("Charecter at Index 2 is: "+str.charAt(2));

        //**********************************************                          QUESTION 2                           ************************************************8*/
        //2.Palindrome or Not
        // Palindrome(str);


        //**********************************************                          QUESTION 3                           ************************************************8*/
        //3.Find Shortest Path from given directions
        System.out.println(shortestPath(str));

    }
}






