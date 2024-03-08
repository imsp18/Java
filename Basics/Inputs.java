import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // create a scanner object

        System.out.print("Enter your name: "); // take input from the user
        String name = scanner.nextLine(); // read the input from the user

        System.out.println("My name is " + name); // print the input

        scanner.close(); // close the scanner
    }
}
