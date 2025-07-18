public class SBinL13 {
    public static void main(String[] args) {

        // Declearation of a StringBuilser-
        StringBuilder sb = new StringBuilder("Rajkumaryogi"); 
        System.out.println(sb);
        System.out.println(sb.length());

        // Char at index 0 -
        System.out.println(sb.charAt(0)); // at index 0 char is R.

        // Set char at index 0 -
        sb.setCharAt(0, 'Y'); // replace char of 0th index- R by char Y.
        System.out.println(sb);
        sb.setCharAt(11, 'o'); // replace char of 11th index- i by char o.
        System.out.println(sb);


        // insert char at index 8- 
        sb.insert(8, 'i'); 
        // insert i at index 8 means - in 'Yajkumar Yogi' add a charater- i -> Yajkumari Yogi 
        // insert i at index 9 means - in 'Yajkumar Yogi' add a charater- i -> Yajkumar iYogi 
        System.out.println(sb);

        // delete char at from index 8-
        sb.delete(8, 9); // from 8 to 9 -> delete only index 8
        System.out.println(sb);
        sb.delete(8, 12); // delete from 8 to 11 index not 12th
        System.out.println(sb);

        // add char in last - append
        StringBuilder st = new StringBuilder("R");
        st.append("a");
        System.out.println(st);
        st.append("j");
        st.append("k");
        st.append("u");
        st.append("m");
        st.append("a");
        st.append("r");
        System.out.println(st);
        // st.append(" ");
        st.append("Y");
        st.append("o");
        st.append("g");
        st.append("i");
        System.out.println(st);

        System.out.println(st.length());

        
      
      

        // reverse fo a string -
        // by me-
        // StringBuilder sb = new StringBuilder("hello");
        // String reverce = "";
        // for(int i = sb.length()-1; i>=0; i--){ // form 5-1=4 to 0 -> 4,3,2,1,0
        //     reverce += sb.charAt(i);

        // }
        // System.out.println(reverce);

          // form solution-
          //   StringBuilder sb = new StringBuilder("HelloWorld");
        
          //  for(int i=0; i<sb.length()/2; i++) {
          //    int front = i;
          //    int back = sb.length() - i - 1;

          //    char frontChar = sb.charAt(front);
          //    char backChar = sb.charAt(back);

          //    sb.setCharAt(front, backChar);
          //    sb.setCharAt(back, frontChar);
          //  }
          //   System.out.println(sb);

    }
    
}
