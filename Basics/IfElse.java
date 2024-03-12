import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //get input from the user

        System.out.print("Enter your age:"); //ask the user to enter their age

        int age = scanner.nextInt(); //read the input from the user

        if (age < 18){
            System.out.println("You are a minor");
        } //if the age is less than 18, print "You are a minor"
        else if(age >= 18 && age < 60){
            System.out.println("You are an adult");
        } //if the age is greater than or equal to 18 and less than 60, print "You are an adult"
        else{
            System.out.println("You are a senior citizen");
        } //if the age is greater than or equal to 60, print "You are a senior citizen"

        scanner.close(); //close the scanner

    }
}
