import java.util.Arrays;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20};
        int[] arr2 = {3, 8, 12, 18};

        // Merge the two arrays into a single array
        int[] mergedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Print the merged and sorted array
        System.out.println("Merged and Sorted Array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
