/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mandeepkaur
 */
public class NewClass9 {
    public static void main(String arg[]) {
        // count the occurance of all character in string using hashmap
     Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String a = sc.nextLine();
        System.out.println("String entered by the user is  1 : " + a);
        a=a.replaceAll(" ", "");
        HashMap<Character,Integer> count= new HashMap<>();
        for(int i=0;i<a.length();i++)
        {
            if(count.containsKey(a.charAt(i)))
            {
                count.put(a.charAt(i), count.get(a.charAt(i))+1);
            }
            else
            {
                  count.put(a.charAt(i), 1);
            }
        }
        System.out.println(count);
        
      
                
        
        
    }
}
