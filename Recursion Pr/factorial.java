public class factorial {
    public static void main(String [] args) {
        System.out.println("N = " + factorial(4));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        else{
            return (n*factorial(n-1));
        } 
    }

    /*
     * Steps taken to reach the output
     * let n = 4
     * until n == 1
     * the function  will be called 3 times
     * 1st Step:4*(4-1) 
     * 2nd Step:4*(3-1)
     * 3rd Step:4*(2-1) 
     * Last Step: 4*3*2*1 = 24;
     */

    
}
