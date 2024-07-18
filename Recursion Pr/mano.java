public class mano {
   

    public static void main(String[]args) {

               System.out.println("recursive function = " + func(4));
               

     }

    public static int func(int val){

        if (val == 0) return (val + 6);

        else return 8 + func(val-1);

      }

  }
