import java.util.Arrays;

public class selection{
   public static void selectionSort(int [] array){
        for (int i = 0; i < (array.length)-1; i++){// one by one move boundary of unsorted array

            int minimunLocation = i;//find the minmum element in the unsorted array

            for (int j=i+1; j < array.length; j++){
                if (array[j] < array[minimunLocation]){
                    minimunLocation = j;
                }
            }

            //swap the minimum element with the 1st element

            int temp = array[minimunLocation];
            array[minimunLocation] = array[i];
            array[i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nun = {23,56,333,234445,234211123,44,5,4545312};

        System.out.println("The unsorted Array" + Arrays.toString(nun));

        selectionSort(nun);
        

        System.out.println("The sorted Array" + Arrays.toString(nun));
        
    }
}