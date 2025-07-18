public class CrBitL15 {
    public static void main(String[] args) {
        int n = 5; 
        int pos = 2;
        int BitMask = 1 << 2; // Not of BitMask
        int NotofBitMask = ~BitMask;
        int NewNumber = (NotofBitMask) & n ;
        System.out.println(NewNumber);
    }
    
}
