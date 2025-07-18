import java.util.Scanner;

public class SBinL131 {
    public static void main(String[] args) { // Solve by StringBuilder-
        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        

        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        StringBuilder str = new StringBuilder("");

        for(int i=0; i<size; i++) { // ex. size = 4
          array[i] = sc.next(); // space not count and 4 values taken -> if nextLine then space count and 3 values
          str.append(array[i]);
        }
        System.out.println(str.length());
        System.out.println(str);

        
    //     Scanner sc = new Scanner (System.in);
    //     int size = sc.nextInt();
    //     String array[] = new String[size];
    //     // int totLength = 0;
    //     String str = "";
   
    //     for(int i=0; i<size; i++) {
    //       array[i] = sc.next();
    //       str += array[i];
    //     //   totLength += array[i].length(); // this is only for sting 
    //     }
    //     StringBuilder sb = new StringBuilder(str);
    //     System.out.println(sb.length());
    //     System.out.println(sb);

    }
         

    
    
}
