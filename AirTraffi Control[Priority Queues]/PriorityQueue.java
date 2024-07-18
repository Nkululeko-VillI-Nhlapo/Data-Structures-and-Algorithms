public class PriorityQueue {

   //Attributes
    private int currentSize; // stores current number of elements in PriorityQueue
    private FlightNode[] arry; // array to store flight nodes, implementsPriorityQueue
    private int DEFAULT_SIZE = 2<<10; // maximum heap size
    
   // default constructor
    public PriorityQueue() {
        currentSize = 0;
        arry = new FlightNode[DEFAULT_SIZE];
    }
    
   //this a loaded constructor
    public PriorityQueue(int capacity) {
        currentSize = 0;
        arry = new FlightNode[capacity];
    }
    
   //accessor methods to get information
    public int getCurrentSize() {
        return currentSize;
    }
    
    public FlightNode[] getArray() {
        return arry;
    }
    
    //mutator methods to update info 
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    
    public void setArray(FlightNode[] array) {
        this.arry = array;
    }
    
    //clear method, this method effectively removes all the elements from the array and reset the array size to 0 
    public void clear() {
        currentSize = 0;
        arry = new FlightNode[DEFAULT_SIZE];
    }
    
    //isEmpty method indicates if the collection is empty or not
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    //add method - to add new elements to a binary heap data structure
    public boolean add(FlightNode x) {
        if (currentSize == arry.length - 1) {
            // if the array is full, double its capacity
            FlightNode[] newArray = new FlightNode[arry.length * 2];
            System.arraycopy(arry, 1, newArray, 1, currentSize);
            arry = newArray;
        }
        // add the new element to the bottom of the heap
        int hole = ++currentSize;
        arry[hole] = x;
        // percolate up to restore heap property
        percolateUp(hole);
        return true;
    }
    
    // remove method - removes elements from the queue
    public FlightNode remove() { //check if the queue is empty
        if (isEmpty()) {
            return null; //if empty return null
        }
        
        // remove the element at the top of the heap
        FlightNode removed = arry[1];
        // replace it with the last element in the heap
        arry[1] = arry[currentSize--];
        // percolate down to restore heap property
        percolateDown(1);
        return removed;
    }
    
    //percolateDown method - use to percolate down a node in a heap structure
    public void percolateDown(int hole) {
        int child;
        FlightNode temp = arry[hole];
        //We then loop through the children of the node until we reach the end of the heap or until we  find a child ghat is greator than the parent
        while (hole * 2 <= currentSize) {
            child = hole * 2;
            if (child != currentSize && arry[child + 1].getArrival_date().before(arry[child].getArrival_date())) {
                child++;
            }
            //comparing arrival dates of the child nodes to determine which one is smaller
            if (arry[child].getArrival_date().before(temp.getArrival_date())) {
                arry[hole] = arry[child];
            } else {
                break;
            }
            hole = child; //if the child  node is greator than the parent swap them
        }
        arry[hole] = temp; //place the orginal node at the final hole
    }
    
    /* percolateUp method */
    private void percolateUp(int hole) {
        FlightNode temp = arry[hole];
        while (hole > 1 && temp.getArrival_date().before(arry[hole / 2].getArrival_date())) {
            arry[hole] = arry[hole / 2];
            hole = hole / 2;
        }
        arry[hole] = temp;
    }
    
}
