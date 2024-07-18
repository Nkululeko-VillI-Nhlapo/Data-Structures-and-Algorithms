
import java.util.Arrays;

//insertion sort for integers
public class insertImplem {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){ //iterate through the array, startig at index 1
            int key = arr[i]; // set the key to the current element at index i
            int j = i - 1;  // set j to be the element at the left of i

            while (j >= 0 && arr[j] >= key){//iterate through the sorted subarray, to the left of i
                arr[j+1] = arr[j]; // move elements to the right until we find the correct postion for the key
                j--;

            }

            arr[j+1] = key; // insert array in its correct postion in the sorted subarray

        }
    }

    public static void main(String[] args) {
       
        int [] arr = {3,56,1,34,52,23,21};
        insertionSort(arr);

        System.out.println("This is the sorted array: " + Arrays.toString(arr));
    }
}