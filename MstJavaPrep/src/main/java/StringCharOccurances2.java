import java.util.Scanner;
public class StringCharOccurances2 {
     public static void main(String args[])
    {
      /*  String s="Toronto";
        int tc=s.length();
        System.out.println("length is : "+tc);
        char[] str = s.toCharArray(); 
        int c=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='o')
            {
               c++; 
            }
        }
      System.out.println("total count for 0 :"+c);
        */
       
        
// count the occurance of any given character in string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String a = sc.nextLine();
        System.out.println("String entered by the user is  : " + a);
        System.out.println("which character do u want to count ?");
        char b = sc.nextLine().charAt(0);
        System.out.println("Character entered by the user is  : " + b);
        int c = 0;
        for (int i = 0; i <= a.length() - 1; i++) {
            if (a.charAt(i) == b) {
                c++; 
            }
        }
        System.out.println("count of the character is :  " + c);

    }
}
