
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandeepkaur
 */
public class sort_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        
        System.out.println("Enter the 5 elements for 1st array");
        for (int i = 0; i != 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("1st array is: ");
        System.out.println(Arrays.toString(arr1));
        
        System.out.println("Enter the 5 elements for 2nd array");
        for (int i = 0; i != 5; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("2nd array is: ");
        System.out.println(Arrays.toString(arr2));
        
        int merged[] = new int[10];
//        System.arraycopy(arr1, 0, merged, 0, 5);  
//        System.arraycopy(arr2, 0, merged, 5, 5); 
        for(int i = 0; i < 5; i++){
            merged[i] += arr1[i];
        }
        for(int i = 0; i < 5; i++){
            merged[i+5] += arr2[i];
        }
        System.out.println("Merged array : ");
        System.out.println(Arrays.toString(merged));
        
        int temp;
        for(int p = 1; p < merged.length; p++){
            for(int q = p; q > 0; q--){
                if (merged[q] < merged[q-1]){
                    temp = merged[q];
                    merged[q] = merged[q - 1];
                    merged[q-1] = temp;
                }
            }
        }
        System.out.println("Merged and sorted array :");
        System.out.println(Arrays.toString(merged));
    }
}

