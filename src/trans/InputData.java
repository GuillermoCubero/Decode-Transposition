package trans;

import java.util.Scanner;

public class InputData {
    private String cipherText;
    private final String possibleWord;

    public InputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert cipher text:");
        this.cipherText = scanner.nextLine();
        System.out.println("Insert possible word:");
        this.possibleWord = scanner.nextLine();
        System.out.println("CALCULATING PERMUTATIONS...");
    }

    public String getCipherText() {
        cipherText = cipherText.replaceAll(" ", "");
        return cipherText;
    }

    public String getPosibleWord() {
        return possibleWord;
    }
    
}