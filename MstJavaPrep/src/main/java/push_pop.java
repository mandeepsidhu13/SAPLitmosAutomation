import java.util.Arrays;
import java.util.Scanner;
 
public class push_pop {
 
    static Scanner sc = new Scanner(System.in);
    static int n = 10, top = -1;
    static int arr[] = new int[n];
 
    public static void main(String[] args) {
        String yes;
        do {
            System.out.println("Which operation do you want to perform?");
            System.out.println("1. push()");
            System.out.println("2. pop()");
            int select = sc.nextInt();
 
            if (select == 1) {
                push();
            } else if (select == 2) {
                pop();
            } else {
                System.out.println("Oops! you have selected wrong option.");
            }
            System.out.println("do you want to perform more operation then press y ");
            yes = sc.next();
        } while (yes.equalsIgnoreCase("y"));
    }
 
    public static void push() {
 
        if (top + 1 == n) {
            System.out.println("Oop! array is full.");
        }
        else {
            System.out.println("Enter the element you want to add to the stack :");
            int push = sc.nextInt();
            
            arr[top + 1] = push;
            top++;
            System.out.println(push + " is added to the stak : ");
        }
        System.out.println(Arrays.toString(arr));
    }
 
    public static void pop() {
        if (top == -1) {
            System.out.println("Opps! array is already empty");
        }
        else {
            System.out.println(arr[top] + " is removed from the stack");
            arr[top] = 0;
            top--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
