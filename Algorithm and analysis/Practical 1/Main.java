//Nhlapo Nkululeko Villicent
//4129962

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Read the array from the input file (change filename as needed)
            List<Integer> array = readArrayFromFile("Input2.txt");

            // Algorithm 1
            long startTime1 = System.nanoTime();
            algorithm1(array);
            long endTime1 = System.nanoTime();
            double duration1 = (endTime1 - startTime1) / 1e9; // Convert to seconds

            // Algorithm 2
            long startTime2 = System.nanoTime();
            algorithm2(array);
            long endTime2 = System.nanoTime();
            double duration2 = (endTime2 - startTime2) / 1e9; // Convert to seconds

            System.out.println("Algorithm 1 Runtime: " + duration1 + " seconds");
            System.out.println("Algorithm 2 Runtime: " + duration2 + " seconds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    // Read the array from a text file
    private static List<Integer> readArrayFromFile(String filename) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] elements = line.split(",");
            for (String element : elements) {
                array.add(Integer.parseInt(element.trim()));
            }
        }
        br.close();
        return array;
    }
    

    // Algorithm 1
    private static void algorithm1(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (x > 0) {
                if (array.contains(-x)) {
                    System.out.println(x + " and " + (-x) + " are in the array");
                }
            }
        }
    }

    // Algorithm 2
    private static void algorithm2(List<Integer> array) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            int sum = array.get(i) + array.get(j);
            if (sum == 0) {
                System.out.println(array.get(i) + " and " + (-array.get(i)) + " are in the array");
                i++;
                j--;
            } else if (sum > 0) {
                j--;
            } else {
                i++;
            }
        }
    }
}
