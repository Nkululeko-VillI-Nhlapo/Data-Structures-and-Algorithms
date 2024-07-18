import java.util.Queue;
import java.util.LinkedList;

public class qu {
  public static void main(String[] args) {
    Queue<Integer> qu = new LinkedList<>();

    qu.add(45);
    qu.add(55);
    qu.add(455);

    System.out.println(qu + " your Qeue");

    int head = qu.remove();
    System.out.println(head + " removed");

    System.out.println(qu +  " your now que");

    System.out.println(qu.peek() + " peeked");

    System.out.println(qu);

    System.out.println(qu.size() +  " is the size of this que");

    



  }  
}
