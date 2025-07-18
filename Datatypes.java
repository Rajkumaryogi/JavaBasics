public class Datatypes {
    public static void main(String[] args) {
        // Datatypes in Java
        // Primitive data types -Byte,Short,Char,Boolean,int,Long,Float,double
        // Non-Primitive data types- String,Array,Class,Object,Interface

        int a = 49;
        int b = 38;
        int sum = a + b;
        System.out.println(sum);
        int diff = a - b ;
        System.out.println(diff);
        int mul = a*b;
        System.out.println(mul);
        int rem = a%b;
        System.out.println(rem);
        int d = a*b / a-b ; // =1862/49-38 = 38- 38=0 don't follow BODMASS

        int e = (a*b) / (a-b) ; // = 1862/(49-38) = 1862/11= 169 

        System.out.println(d);
        
        System.out.println(e);
        
    }
    
}
