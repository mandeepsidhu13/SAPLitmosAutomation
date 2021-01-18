/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandeepkaur
 */
public class StringManipulation {
    public static void main(String[] args) {
        // third occurance of any character in String
        String str="i love java programming";
        System.out.println( str.indexOf("a"));
            System.out.println( str.indexOf("a",str.indexOf("a")+1));
         System.out.println( str.indexOf("a",str.indexOf("a",str.indexOf("a")+1)+1));
                 System.out.println( str.indexOf("z"));
                 
                String stra[]=str.split(" ");
                for(int i=0;i<stra.length;i++)
                {
                    System.out.println(stra[i]);
                }
                String a="hello";
                String b="world";
                int x=100;
               int y=200;
               System.out.println(a+b);
               System.out.println(x+y);
               System.out.println(a+b+x+y);
               System.out.println(x+y+a+b);
               System.out.println(a+b+(x+y));
                
    }
   
}
