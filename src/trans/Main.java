package trans;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData();
        for (int i = 2; i < 15; i++) {
            ArrayList<int[]> overflowsList = ArrayPermutation.createPermutationListOfArrayWithRepItems(MyArrays.createSpaceArrayOfLength(inputData.getCipherText().length()%i,i));
            ArrayList<int[]> pertmutationList = ArrayPermutation.createPermutationListOfArrayWithoutRepItems(MyArrays.createOfLength(i));
            for (int[] permutation : pertmutationList) {
                for (int[] overflows : overflowsList) {
                    String decode = Decodification.decode(permutation, overflows, inputData.getCipherText());
                    if (decode.contains(inputData.getPosibleWord()) && decode.endsWith(generateStringOfSpaces(i-(inputData.getCipherText().length()%i)))){
                        System.out.println("Permutation: " + Arrays.toString(permutation) + " Overflows: " + Arrays.toString(overflows));
                        System.out.println(decode);
                        System.exit(0);
                    }
                }
            }
        }
    }

    private static void printArrayList(ArrayList<int[]> permutations) {
        for (int[] permutation : permutations)System.out.println(Arrays.toString(permutation));
    }

    private static String generateStringOfSpaces(int i) {
        String spaces = "";
        for (int j = 0; j < i; j++)spaces += "-";
        return spaces;
    }
    
}
