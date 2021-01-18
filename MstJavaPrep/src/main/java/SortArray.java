
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandeepkaur
 */
public class SortArray {
    public static void main(String[] args) {
        String a="java";
        char[] b=a.toCharArray();
        
        System.out.println("array before sort : "+Arrays.toString(b));
        //Arrays.sort(b);
        Arrays.parallelSort(b);
           System.out.println("array after sort : "+Arrays.toString(b));
        Integer[] a1={12,67,45,23,89};
        Arrays.sort(a1,Collections.reverseOrder());
         System.out.println("array before sort : "+Arrays.toString(a1));
           System.out.println("array after sort : "+Arrays.toString(a1));
       
    }
}
