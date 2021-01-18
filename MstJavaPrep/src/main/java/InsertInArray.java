
import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = {10, 15, 16, 18, 2, 50, 25};
        System.out.println("An existing array : " + Arrays.toString(a));
        System.out.println("Enter the position where you want to insert an element:");
        int position = s.nextInt();
        System.out.println("Enter the element you want to insert:");
        int new_value = s.nextInt();
        for (int i=(a.length-1); i>position; i--) {
            a[i] = a[i-1];
        }
        a[position] = new_value;
        System.out.println("After inserting in an Array:");
        System.out.println(Arrays.toString(a));
    }
}
