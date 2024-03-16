public class MultipleParameter {
    public static void main(String[] args){
        MainMethod("John", 25); // Calling the method with multiple parameters

    }

    static void MainMethod(String name, int age){ // Method with multiple parameters
        System.out.print("My name is " + name + " ,i am " + age +" years old");
    }
}
