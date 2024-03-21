import java.util.Scanner;
public class Recursion {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int result = input.nextInt();
        System.out.println(sum(result));

        input.close();
    }
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }
}
