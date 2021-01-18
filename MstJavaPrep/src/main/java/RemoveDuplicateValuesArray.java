
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandeepkaur
 */
public class RemoveDuplicateValuesArray {
    public static void main(String[] args) {
        String[] arr = {"trisha", "Samip", "Ishan", "Trisha", "Mandeep", "Mandeep", "trisha", "Priyanshu", "Kahani"};
        int length = arr.length;
        String[] removed;
        removed = removeDuplicates(arr, length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removed));
    }

    public static String[] removeDuplicates(String s[], int n) {
        String[] temp = new String[n];
        temp[0] = s[0];
        int c = 0;
        int k = 1;

        for (int i = 1; i < s.length; i++) {
            c = 0;
            for (int j = 0; j <= i; j++) {

                if (s[i].equalsIgnoreCase(temp[j])) {
                    c++;
                }
            }
            if (c == 0) {
                temp[k] = s[i];
                k++;
            } else {
                continue;
            }
        }
        return temp;
    }
}
