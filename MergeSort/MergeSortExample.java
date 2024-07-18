/*MergeSort is a divide and conquer algorithm, which is based on the idea of dividing a given array in 
half and sorting each half independently*/

public class  MergeSortExample {

/*Begin the merge process, which MergeSort depends on...
The merge procedure combines two sorted lists into a single list*/
  public void merge(int[] arr, int[] left_arr,int[] right_arr, int left_size, int right_size){
      
      int left=0,right = 0, k=0;

      //These loops check the conditions for merging two lists

      while(left<left_size && right<right_size){
          
          if(left_arr[left]<right_arr[right]){
              arr[k++] = left_arr[left++];
          }
          else{
              arr[k++] = right_arr[right++];
          }
      }
      while(right<right_size){
        arr[k++] = right_arr[right++];
      }
      while(left<left_size){
          arr[k++] = left_arr[left++];
      }
  }
 // This is the procedure for mergesort, calling the merge function
  public void mergeSort(int [] arr, int len){
      if (len <= 1){
          return;
      }
      int mid = len / 2;
      int [] left_arr = new int[mid];
      int [] right_arr = new int[len-mid];
    
    //Dividing array into two halves and copying into two sub arrays
      int j = 0;
      for(int i = 0; i<len;++i){
          if(i<mid){
              left_arr[i] = arr[i];
          }
          else{
              right_arr[j] = arr[i];
              j = j+1;
          }
      
      }
    // Recursively calling mergeSort to further divide array
      mergeSort(left_arr, mid);
      mergeSort(right_arr, len-mid);
    // invoking the merge procedure on each subcomponent
      merge(arr, left_arr,right_arr,mid,len-mid);
  }
  // a method to display/print elements in an array ( arr)
    void display(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" , ");
    }

 // Driver code to test the above procedure

  public static void main( String args[]) {
        int [] sample = {7, 2, 9, 4, 3, 8, 6, 1, -5};  // sample input to be sorted
        System.out.println("\nArray elements before sorting are:\n"); 
        MergeSortExample my_obj = new MergeSortExample();
        my_obj.display(sample);
        System.out.println("\n \n Result after Merge sort (in ascending order) has been applied is as follows:\n");
        my_obj.mergeSort(sample,sample.length);
        my_obj.display(sample);
        }
}