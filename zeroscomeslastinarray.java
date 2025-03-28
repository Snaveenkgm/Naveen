import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input the size of the array
        int arr1[] = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Create a list to store non-zero elements
        List<Integer> nonZeroList = new ArrayList<>();

        // Separate non-zero elements into the list
        for (int i = 0; i < n; i++) {
            if (arr1[i] != 0) {
                nonZeroList.add(arr1[i]);
            }
        }

        // Sort the non-zero elements in descending order
        Collections.sort(nonZeroList, Collections.reverseOrder());

        // Reconstruct the array with non-zero elements followed by zeros
        int index = 0;

        // Add sorted non-zero elements to the array
        for (int i = 0; i < nonZeroList.size(); i++) {
            arr1[index++] = nonZeroList.get(i);
        }

        // Fill the remaining positions with zeros
        while (index < n) {
            arr1[index++] = 0;
        }

        // Print the final array
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
