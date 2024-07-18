import java.util.ArrayDeque;

public class arrayDeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(3);
        stack.push(5);
        stack.push(45);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());

            
        }
    }
}
