import java.util.Scanner;
public class countCharacterOccurences4 {
    public static void main(String args[]) {
        // count the occurance of all character in string using loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String a = sc.nextLine();
        System.out.println("String entered by the user is  1 : " + a);
        a = a.replaceAll(" ", "");
        System.out.println("String entered by the user is  2 : " + a);
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    c++;
                }
            }
            System.out.println(a.charAt(i) + "         " + c);
            a = a.replace(a.charAt(i), ' ');
            a = a.replaceAll(" ", "");
            //System.out.println("new string at the end is : " + a);
            i--;
        }
    }
}
