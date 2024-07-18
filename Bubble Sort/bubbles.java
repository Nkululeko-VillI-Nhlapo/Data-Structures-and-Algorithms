
import java.util.Arrays;

public class bubbles {
    public static void bubbleSort(int[] array){
       int n = array.length;
       
       for (int i = 0; i < n ; i++){
        for (int j = 0; j < n-i-1; j++){
            if (array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1]  = temp;


            }
        }

    
       }

    }

    public static void main(String[] args) {
        int[] bubbles = {4,56,2,1234,56,43,433,211,31,35,76};
        bubbleSort(bubbles);

        System.out.println("Sorted Array: " + Arrays.toString(bubbles));
    }
}
