import java.util.Scanner;
public class swap {
    public static void main(String args[]) {
        // when we pass any values at run time at command line 
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter first number");
        number1 = sc.nextInt();
        System.out.println("Enter second number");
        number2 = sc.nextInt();
        System.out.println("Values before Swapping");
        System.out.println("First number entered by the user is : " + number1);
        System.out.println("Second number entered by the user is : " + number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Values after Swapping");
        System.out.println("First number entered by the user is : " + number1);
        System.out.println("Second number entered by the user is : " + number2);

    }

}
