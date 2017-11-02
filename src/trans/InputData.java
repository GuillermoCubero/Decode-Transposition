package trans;

import java.util.Scanner;

public class InputData {
    private String cipherText;
    private final String possibleWord;

    public InputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert cipher text:");
        this.cipherText = scanner.nextLine();
        System.out.println("Insert probable word:");
        this.possibleWord = scanner.nextLine();
        System.out.println("DECIPHERING...");
    }

    public String getCipherText() {
        cipherText = cipherText.replaceAll(" ", "");
        return cipherText.toUpperCase();
    }

    public String getPosibleWord() {
        return possibleWord.toUpperCase();
    }
    
}