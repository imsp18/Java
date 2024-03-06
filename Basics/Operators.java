public class Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) ); // addition
        System.out.println("a - b = " + (a - b) ); // subtraction
        System.out.println("a * b = " + (a * b) ); // multiplication
        System.out.println("b / a = " + (b / a) ); // division
        System.out.println("b % a = " + (b % a) ); // modulus
        System.out.println("c % a = " + (c % a) ); // modulus
        System.out.println("a++   = " +  (a++) ); // increment
        System.out.println("a--   = " +  (a--) ); // decrement
        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) ); 
        System.out.println("++d   = " +  (++d) );
    }
}
