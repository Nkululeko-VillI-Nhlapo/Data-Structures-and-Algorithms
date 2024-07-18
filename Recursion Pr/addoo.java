

public class addoo {
    static int add(int p, int q){
        if (p==0){
            return q;
        }
        else{
            return add(--p, ++q);
        }
   
    }

    public static void main(String [] args) {
        System.out.println("Q is = " + add(4,3));
    }
}