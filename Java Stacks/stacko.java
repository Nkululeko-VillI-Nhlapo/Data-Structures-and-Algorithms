import java.util.Stack;

public class stacko {
    public static void main(String[] args) {
        Stack<String> stacko = new Stack<String>();
        System.out.println(stacko.isEmpty());
        stacko.push("hy");
        stacko.push("hyyy");
        System.out.println(stacko);
        stacko.peek();
        System.out.println(stacko);
        stacko.search("hyy");
        System.out.println(stacko.search("hy"));
        System.out.println(stacko.size());
        stacko.pop();
        System.out.println(stacko);
    }

    //arraysdeque are said to be betteer
    
}
