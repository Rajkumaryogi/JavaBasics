import java.util.Scanner;

import javax.swing.text.Position;

public class UpBitL15 {
    public static void main(String[] args) {
        // Update Bit - 
         Scanner sc = new Scanner(System.in);
         int Operation = sc.nextInt(); // enter 0 or 1
         int n = 5; 
         int position = 1;
         int BitMask = 1 << position ;
         if(Operation == 1){
            // Set - for 1 
            int NewNumber = BitMask | n ; // 0010 or 0101 => 0111 = 7
            System.out.println(NewNumber);
         }
         else{
            // Clear- for 0 
            int NotofBitMask = ~BitMask;
            int NewNumber = NotofBitMask & n; //// 1101 and 0101 => 0101 = 5
            System.out.println(NewNumber);

         }

    }
    
}
