public class prod {
    static int product(int a, int n){
        if (n==1){
            return a;
        }
        else{
            return (a + product(a, n-1));

            /*
             * 2 + (2,4)
             * 2+2 (2,3)
             * 2+2+2 (2,2)
             * 2+2+2+2 (2.1)
             */
        }
    }


    public static void main(String [] args) {
        System.out.println( "pRODUCT OF 2 NUMS = "  + product(5, 3));
    }
}
