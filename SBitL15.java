public class SBitL15 {
    public static void main(String[] args) {
        // set the 2nd Bit (Position = 1) of a number n. ( n =0101 =>5 ) Ans is : 7 because 0101 changes to 0111 - second bit having change from right side 
        int n = 5; // 0101
        int position = 1; //01(0)1 - position inside breaket
        int BitMask = 1<<1; // 0001 << 1 -: 0010

        int NewNumber = BitMask | n ; // 0010 OR 0101(n) =: 0111 => 7
        System.out.println(NewNumber);
    } 
    
}
