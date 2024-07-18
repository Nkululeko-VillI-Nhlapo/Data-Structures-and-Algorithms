
//Start with the partitioning process which is very importatnt for this sort algo
public class QuickSort{
    public int Partition(int[] array, int low, int high){
        int pivot = array[low]; //this selects the first element as the pivot

        while(low <= high){
            while(array[low] < pivot){
                low++;
            }

            while(array[high] > low){
                high--;
            }

            if (low <= high){

                //swap the positions of the elements at high and low
                int tmp = array[low];
                array[low] = array[high];
                array[high] = tmp;
                low++;
                high--;
            }
        }
        return low;//this ensures the correct postion for the pivot element in the partition

       

        
    }

     //the procedure for quicksort call the partition function

    public void recursionQuicksort(int[] array, int left, int right){

        int index = Partition(array, left, right);

        if ( left < index-1){
            recursionQuicksort(array, left, index-1);
        }

        if (right > index){
            recursionQuicksort(array, index, right);
        }

    }

    // a method to print or display elements in the array

    void display(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " , ");
        }
    }

    public static void main(String[] args) {
        int[]  sample = {67,72,77,82,87,62,57,52,45};      // sample input to be sorted
        QuickSort my_obj = new QuickSort();   //creating an object of the class
        System.out.println("\nArray elements before sorting are:\n");    
        my_obj.display(sample);
        my_obj.recursionQuicksort(sample, 0, (sample.length)-1);
        System.out.println("\n \n Result after quick sort (in ascending order) has been applied is as follows:\n");
        my_obj.display(sample);
    }

}
