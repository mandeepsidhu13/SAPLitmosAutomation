
import java.util.Arrays;

public class Merge_Sort {

    static int arr2[] = new int[6];

    public static void mergeSort(int arr[], int lb, int mid, int ub) {

        int i = lb, j = mid + 1, k = lb;
       
        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                arr2[k] = arr[i];
                i++;
            } else {
                arr2[k] = arr[j];
                j++;
            }
            k++;
        }

//        if (i > mid) {
//            while (j <= ub) {
//                arr2[k] = arr[j];
//                j++;
//                k++;
//            }
//        } else {
//            while (i <= mid) {
//                arr2[k] = arr[i];
//                i++;
//                k++;
//            }
//        }
        
        if(i<=mid)
{
    while(i<=mid)
    {
        arr2[k] = arr[i];
                i++;
                k++;
    }
}
if(j<=ub)
{
    while(j<=ub)
    {
        arr2[k] = arr[j];
                j++;
                k++;
    }
}
         

    }

    public static void divideArray(int arr[], int lb, int ub) {
        if (lb < ub) {
            // Find the middle point
            int mid = (lb + ub) / 2;

            // Sort first and second halves
            divideArray(arr, lb, mid);
            divideArray(arr, mid + 1, ub);

            // Merge the sorted halves
            mergeSort(arr, lb, mid, ub);

        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted Array");
        divideArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr2));

    }

}
