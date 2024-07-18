import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CombinationSearch {
    public static void main(String[] args) {
        String inputFile = "combinations.txt";
        int[] searchCombination = {19, 21, 25, 41, 49, 9}; // Replace with the combination you want to search for

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                int[] combination = parseCombination(line);

                if (Arrays.equals(combination, searchCombination)) {
                    System.out.println("Found the search combination: " + Arrays.toString(combination));
                    found = true;
                    break; // If you only want to find the first match, you can break here.
                }
            }

            if (!found) {
                System.out.println("Search combination not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] parseCombination(String line) {
        // Assuming the combinations are stored in the format "[num1, num2, num3, num4, num5, num6]"
        line = line.replaceAll("\\[|\\]", ""); // Remove brackets
        String[] parts = line.split(", ");
        int[] combination = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            combination[i] = Integer.parseInt(parts[i]);
        }
        return combination;
    }
}
