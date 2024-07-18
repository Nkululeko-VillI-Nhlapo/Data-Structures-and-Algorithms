import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CombinationGenerator {
    public static void main(String[] args) {
        int[] numbers1To50 = generateNumbers(1, 50);
        int[] numbers1To20 = generateNumbers(1, 20);

        String outputFile = "combinations.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            generateAndWriteCombinations(writer, numbers1To50, numbers1To20);
            System.out.println("Combinations have been written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] generateNumbers(int start, int end) {
        int[] numbers = new int[end - start + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }
        return numbers;
    }

    public static void generateAndWriteCombinations(BufferedWriter writer, int[] arr1, int[] arr2) throws IOException {
        for (int i = 0; i < arr1.length - 4; i++) {
            for (int j = i + 1; j < arr1.length - 3; j++) {
                for (int k = j + 1; k < arr1.length - 2; k++) {
                    for (int l = k + 1; l < arr1.length - 1; l++) {
                        for (int m = l + 1; m < arr1.length; m++) {
                            for (int n : arr2) {
                                int[] combination = {arr1[i], arr1[j], arr1[k], arr1[l], arr1[m], n};
                                // Write the combination to the file
                                writer.write(arrayToString(combination));
                                writer.newLine();
                            }
                        }
                    }
                }
            }
        }
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

