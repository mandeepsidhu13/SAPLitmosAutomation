import java.util.Arrays;
import java.util.Scanner;
 
public class reverse_string {
 
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("How many elements you want in an array? :"); //takes size of an array
        n = sc.nextInt();
        char arr[] = new char[n];
 
        System.out.println("Enter the elements in array:");//takes elements of an array
        for (int i = 0; i != n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("array of characters is  :"); 
        System.out.println(Arrays.toString(arr)); //prints an array
 
        printReverse(arr);
    }
 
    public static void printReverse(char[] letters) {
        
        char arr2[] = new char[n]; //take a new array
        for (int i = letters.length - 1; i >= 0; i--) {
            arr2[n - i - 1] += letters[i]; //stores reversed array in new array
        }
        System.out.println("Reversed array of characters is  :"); 
        System.out.println(Arrays.toString(arr2)); //prints a reversed array
    }
}
