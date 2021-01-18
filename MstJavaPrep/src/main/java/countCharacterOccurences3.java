import java.util.Scanner;
public class countCharacterOccurences3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String a = sc.nextLine();
        a = a.replace(" ", "");
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    c++;
                }
            }
            if (a.charAt(i) != ' ') {
                System.out.println(a.charAt(i) + "     " + c);
                a = a.replace(a.charAt(i), ' ');
            }
        }
    }
}
