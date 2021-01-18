import java.util.Scanner;
public class countCharacterOccurences34 {
    public static void main(String arg[]) {
        // count the occurance of all character in string using loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String a = sc.nextLine();
        System.out.println("String entered by the user is  1 : " + a);
       // a=a.trim();
       // System.out.println("String entered by the user is  2 : " + a);
        a=a.replaceAll(" ", "");
        System.out.println("String entered by the user is  2 : " + a);
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            c = 0;
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==' ')
               {
                   break;
               }
                if (a.charAt(i) == a.charAt(j) ) {
                    c++;
                }
            }
            if(a.charAt(i)!=' ')
            {
            System.out.println(a.charAt(i) + "         " + c);
            a=a.replace(a.charAt(i), ' ');
            }
        }

    }
}
