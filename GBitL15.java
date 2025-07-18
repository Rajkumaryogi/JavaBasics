public class GBitL15 {
    public static void main(String[] args) {
        // Get the 3rd Bit (Position =2 ) of a number n. ( n =0101 =>5 ) Ans is 1 : because 2nd position no. is 1 in the number 0101 from right side. for position =3 Ans is 0.
        int n = 5; // 0101
        int pos = 2; // position no. 2 and bit no. 3
        int BitMask = 1 << pos; // Sifting 1 by psition 2 -: 0001 << 2 -: 0100 (BM)
        if((BitMask & n) == 0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is One");
        }
    }
    
}
 