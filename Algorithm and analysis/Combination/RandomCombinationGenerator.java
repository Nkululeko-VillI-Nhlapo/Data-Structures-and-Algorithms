import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCombinationGenerator {
    public static void main(String[] args) {
        int[] numbers1To50 = generateNumbers(1, 50);
        int[] numbers1To20 = generateNumbers(1, 20);

        int numberOfCombinationsToGenerate = 3; // Change this value to the desired number of combinations

        List<int[]> combinations = generateRandomCombinations(numbers1To50, numbers1To20, numberOfCombinationsToGenerate);

        // Print the generated combinations
        for (int[] combination : combinations) {
            System.out.println(arrayToString(combination));
        }
    }

    public static int[] generateNumbers(int start, int end) {
        int[] numbers = new int[end - start + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }
        return numbers;
    }

    public static List<int[]> generateRandomCombinations(int[] arr1, int[] arr2, int numberOfCombinations) {
        List<int[]> combinations = new ArrayList<>();
        Random random = new Random();

        while (combinations.size() < numberOfCombinations) {
            List<Integer> combinationList = new ArrayList<>();

            // Randomly select 5 numbers from arr1
            for (int i = 0; i < 5; i++) {
                int index = random.nextInt(arr1.length);
                combinationList.add(arr1[index]);
                arr1 = removeElement(arr1, index);
            }

            // Randomly select 1 number from arr2
            int index2 = random.nextInt(arr2.length);
            combinationList.add(arr2[index2]);

            // Convert List<Integer> to int[]
            int[] combination = new int[combinationList.size()];
            for (int i = 0; i < combination.length; i++) {
                combination[i] = combinationList.get(i);
            }

            combinations.add(combination);
        }

        return combinations;
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, index);
        System.arraycopy(arr, index + 1, newArray, index, arr.length - index - 1);
        return newArray;
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
