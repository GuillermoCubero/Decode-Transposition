package trans;

import java.util.ArrayList;

public class ArrayPermutation {

    public static ArrayList<int[]> createPermutationListOfArrayWithRepItems(int[] array) {

        ArrayList<int[]> arrays = new ArrayList<>();
        java.util.Arrays.sort(array);
        permuteRepIteretive(array, arrays);
        return arrays;
    }

    public static ArrayList<int[]> createPermutationListOfArrayWithoutRepItems(int[] array) {

        ArrayList<int[]> arrays = new ArrayList<>();
        permuteHelper(array, arrays, 0);
        return arrays;
    }

    private static void permuteHelper(int[] arr, ArrayList<int[]> arrays, int index) {
        if (index >= arr.length - 1) { //If we are at the last element - nothing left to permute
            arrays.add(arr.clone());
            return;
        }

        for (int i = index; i < arr.length; i++) { //For each index in the sub array arr[index...end]

            //Swap the elements at indices index and i
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            //Recurse on the sub array arr[index+1...end]
            permuteHelper(arr, arrays, index + 1);

            //Swap the elements back
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }

    private static void permuteRepIteretive(int[] ps, ArrayList<int[]> arrays) {
        arrays.add(ps.clone());
        int n = ps.length;
        int tmp = 0;

        // indexes[i] = i+1;
        int[] indexes = new int[n];
        for (int i = 0; i < n - 1;) {
            indexes[i] = ++i;
        }

        for (int i = n - 2; i >= 0;) {

            while (indexes[i] < n && ps[indexes[i]] == ps[i]) {
                indexes[i]++;
            }

            // swap ps[i] <--> ps[indexes[i]
            if (indexes[i] < n) {
                tmp = ps[indexes[i]];
                ps[indexes[i]] = ps[i];
                ps[i] = tmp;

                arrays.add(ps.clone());
            }

            indexes[i]++;

            i = n - 2;

            while (i >= 0 && indexes[i] >= n) {
                // Undo previous permutation from i+1
                // Cyclical rotation to the left from i+1
                // ps[k] = ps[k+1]
                tmp = ps[i];
                for (int k = i; k < n - 1;) {
                    ps[k] = ps[++k];
                }
                ps[n - 1] = tmp;

                // indexes[i]=i+1;
                // i--;
                indexes[i] = i-- + 1;
            }
        }
    }
}