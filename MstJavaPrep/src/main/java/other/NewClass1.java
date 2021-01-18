/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.util.Scanner;

/**
 *
 * @author mandeepkaur
 */
public class NewClass1 {

    public static void main(String arg[]) {
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
