public class QuickSortExample{

    //Begin the partitioning process, which QuickSort depends on...

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];           // This selects the first element as the pivot
        while(low<=high) { 
            while(arr[low] < pivot)
                low++;
            while(arr[high] > pivot)
                high--;
            if(low<=high) {
                //swap the positions of elements at high and low 
                int tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
                low++;
                high--;
            }
        }
        return low;      // This ensures the correct position for the pivot element in the partition
    }

    // This is the procedure for quicksort, calling the partition function

    public void recursiveQuickSort(int[] arr, int left, int right) {
       int index = partition(arr, left, right);
       if(left < index-1) {
           recursiveQuickSort(arr, left, index-1);
        }
       if(right > index) {
           recursiveQuickSort(arr, index, right);
        }
    }
    // a method to display/print elements in the array
    void display(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" , ");
    }

    // Driver code to test the above procedure

    public static void main(String[] args) {
        int[]  sample = {67,72,77,82,87,62,57,52,45};      // sample input to be sorted
        QuickSortExample my_obj = new QuickSortExample();   //creating an object of the class
        System.out.println("\nArray elements before sorting are:\n");    
        my_obj.display(sample);
        my_obj.recursiveQuickSort(sample, 0, (sample.length)-1);
        System.out.println("\n \n Result after quick sort (in ascending order) has been applied is as follows:\n");
        my_obj.display(sample);
    }
}