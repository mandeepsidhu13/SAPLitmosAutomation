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
// find the occurance of given character in a string
// java  -> a -> 2
// java -> j -> 1
public class NewClass {

    public static void main(String arg[]) {
        // count the occurance of any given character in string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String a = sc.nextLine();
        System.out.println("String entered by the user is  : " + a);
        int ln = a.length();
        System.out.println("original length is  : " + ln);
        int lnn = a.replace("p", "").length();
        System.out.println("new  length is  : " + lnn);
        int c = ln - lnn;
        System.out.println("count of chracter is : " + c);

    }

}
