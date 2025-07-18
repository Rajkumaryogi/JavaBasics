import java.util.Scanner;

public class StringsinL12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nextLine() for complete name as a input-> next() for only first name as a input
        // String name = sc.nextLine(); 
        //  System.out.println("Your name is : "+ name); 

        // Concatenation- addition of strigs 
         String firstname = "Raj";
         String lastname  = "Yogi";
         String fullname = firstname + " " + "@"+ " " + lastname ;
         System.out.println(fullname); 
         // for length of string- Raj @ Yogi = 3+1+1+1+4 =10
         System.out.println(fullname.length());

         // charAt- Stringname.charAt(i)- charater at ith position
         for(int i = 0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i)); 

         }
         // Compare two strings-

         // s1 > s2 -> +ve no.
         // s1 == s2 -> 0
         // s1 < s2  -> -ve no.
         if(firstname.compareTo(lastname)==0){
            System.out.println("Strings are equal ");
        }else{
            System.out.println("Strings are not equal ");
        }
        
        // == is not working every time so we use {s1.compareTo(s2)}- 
        if(new String("Raj") == new String("Raj")){ 
            System.out.println("Strings are equal ");
            
        }else{
             System.out.println("Strings are NOT equal ");

         }

        //  substring(begining index, Endig index) of a string-
        String name = "Rajkumar Yogi"; // name.length = n-1
        // String t = name.substring(5, name.length()); // auto take ending index = n-1
        String t = name.substring (5); // auto take ending index = n-1
        System.out.println(t);
        String p = name.substring(0,8); 
        // from 0 to 8 having 9 charactor but it will take only 8 charactors - 0,1,2,3,4,5,6,7 = Rajkumar
        System.out.println(p);

    }
    
}
