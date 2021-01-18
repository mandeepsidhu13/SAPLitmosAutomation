
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandeepkaur
 */
public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[]={12,14,15,12,14,15,12};
        Boolean status=false;
        HashSet<Integer> lang= new HashSet<>();
      //  System.out.println("Duplicate values in Array");
        for(int i:arr)
        {
            if(lang.add(i)==false)
            {
                System.out.println("Duplicate Value : "+i);
                status=true;
            }
        }
        if(status==false)
        {
            System.out.println("Duplicates Value not found");
        }
    }
}
