public class TypeCasting {
    public static void main(String[] args){
        int number1 = 10;
        double number2 = number1; // Implicit casting or Widening casting

        double number3 = 5.8;
        int number4 = (int) number3; // Explicit casting or Narrowing casting
        
        System.out.println("number4: " + number4); // Output: 10
        System.out.println("number2: " + number2); // Output: 10.0
    }
}
