import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactTracing {

    public static List<String> getPairs(int[] arrTime, int[] depTime) {
        List<String> prs = new ArrayList<>();
        int arrLength = arrTime.length;

        for (int x = 0; x < arrLength; x++) {
            for (int b = x+1; b < arrLength; b++) {
                if (arrTime[b] <= depTime[x] && depTime[b] >= arrTime[x]) {
                    String pair = "(" + (x+1) + ", " + (b+1) + ")";
                    prs.add(pair);
                }
            }
        }

        return prs;
    }
    public static void main(String[] args) {
        Scanner typeIn = new Scanner(System.in);
        
       
        System.out.print("How many baby pairs?: ");
        int n = typeIn.nextInt();
        
       
        int[] arrTime = new int[n];
        int[] depTime = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.print("Give the arrival time for baby number " + (k+1) + ", ");
            arrTime[k] = typeIn.nextInt();
            System.out.print("Give the departure time for baby number " + (k+1) + ", ");
            depTime[k] = typeIn.nextInt();
        }
        
       
        List<String> babyPrs = getPairs(arrTime, depTime);
        System.out.println("The distinct pairs of babies who are at the crèche at the same time are: ");
        for (String pr : babyPrs) {
            System.out.println(pr);
        }
    }


    
}