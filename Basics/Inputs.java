import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // create a scanner object

        System.out.print("Enter your name: "); // take input from the user
        String name = scanner.nextLine(); // read the input from the user

        System.out.printf("Hello %s. How old are you?", name); // print the input
        int age =  scanner.nextInt(); //

        System.out.printf("%d is an excellent age to start programming: ", age); 

        scanner.close(); // close the scanner
    }
}
