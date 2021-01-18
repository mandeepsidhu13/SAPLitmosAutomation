import java.util.Scanner;
public class countWordsString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String a = sc.nextLine();// Welcome to java
        System.out.println("String entered by the user is : " + a);
        int length = a.length();
        System.out.println("Length of the string is : " + length);
        a=a.trim();
        System.out.println("new string is  : "+a);
        length = a.length();
        System.out.println("Length of new string is : " + length);
        int count=1;
        for (int i = 0; i < a.length() - 1; i++) {
         if(a.charAt(i)==' ' &&  a.charAt(i+1)!=' ')
         {
             count++;
         }
        }
        System.out.println("Total no of words in the given string is : "+count);

    }
}
