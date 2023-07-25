//STRINGS ALL BASIC TO INTERMIDIATE QUETIONS

import java.nio.charset.CharsetEncoder;
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


    //6.Converts first letter to upper case
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    //7.String COmpression
    public static String strCompress(String str){
        //using String
        // String newStr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr+=str.charAt(i);
        //     if(count>1){
        //         newStr += count.toString();
        //     }
        // }
        // return newStr;


        //USing String Builder
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }


    //8.Count Vowels Occureed in String entered by the User
    public static int countLcase(String str){
        int c =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                c++;
            }
        }
        return c;

    }

    //9.Anagrams or Not
    public static void anagrams(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            if(Arrays.equals(str1charArray,str2charArray)){
                System.out.print("They are Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }
        else{
        System.out.println("Not Anagrams");
    }

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

        // System.out.println("Length of String is: "+str.length()); //we also use concatenation in every rint str1+str2 = concatenation
        // System.out.println("Charecter at Index 2 is: "+str.charAt(2));

        //**********************************************                          QUESTION 2                           ************************************************8*/
        //2.Palindrome or Not
        // Palindrome(str);


        //**********************************************                          QUESTION 3                           ************************************************8*/
        //3.Find Shortest Path from given directions
        // System.out.println(shortestPath(str));

        
        //**********************************************                          QUESTION 4                           ************************************************8*/
        //4.More inBuilt String Functions
        // String str2="abcd";
        // str.equals(str2); //returns true is equal else false
        // str.substring(0, 3); //ending index is not included 0-2 charecters are printed in this case
        // str.compareTo(str2); //it goes letter by letter
        // str.compareToIgnoreCase(str2); // comapares and gives 
        //if 0 --both are equal
        //if <0 or -ve -- str<str2
        //if >0 or +ve -- str>str2



        //**********************************************                          QUESTION 5                           ************************************************8*/
        //5.String Builder
        //Are mutable 
        //Creatoin and Addition and Basic In-Built String BUilder Functions
        // StringBuilder sb = new StringBuilder("Neeraj");
        // sb.toString(); //converts to string
        // //whenever new keyword is sued that is an object [Integer and all this data types are Objects]
        // sb.append(" GS"); //adds this to the end of sb


        //**********************************************                          QUESTION 6                           ************************************************8*/
        //6.Convert each first letter of word to Uppercase
        // System.out.println(toUpperCase(str));


        //**********************************************                          QUESTION 7                           ************************************************8*/
        //7.String Compression
        //ex: aaabbcccd -- a3b2c3d
        // System.out.println(strCompress(str));


        //**********************************************                          QUESTION 8                           ************************************************8*/
        //8.Count NUmber of LowerCase Vowels Occured in String
        // System.out.println(countLcase(str));

        
        //**********************************************                          QUESTION 9                           ************************************************8*/
        //9.Check if strings are anagrams or not
        // String str2 = "race";
        // anagrams(str,str2);




    }
}






