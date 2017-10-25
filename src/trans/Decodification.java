package trans;

import java.util.*;

public class Decodification {
    
    private String Originalkey;
    private String Codification;
    
    public void Input(InputOutput datos) {
        Originalkey = datos.key;
        Codification = datos.code;
        if( datos.key != null){
            DecodeWithKey();
        }else{
            DecodeWithBruteForce();
        }
    }

    private void DecodeWithKey() {
        KeyTransformation();
        ArrayList<String> matrix = new ArrayList<>();
        int leters = Originalkey.length()/Codification.length();
        int overflow = Originalkey.length()%Codification.length();
        for (int i = 0; i < Originalkey.length(); i++) {
            
        }
    }

    private void DecodeWithBruteForce() {
    }

    private void KeyTransformation() {
        ArrayList<Integer> transformation = new ArrayList<>();
        String keyToUpper = Originalkey.toUpperCase();
        
        for (int i = 0; i < keyToUpper.length(); i++) {
            transformation.add((int) keyToUpper.charAt(i) - 64);
        }
        
        int higherPosition = transformation.indexOf(Collections.max(transformation));
        for (int i = 0; i < keyToUpper.length(); i++) {
            transformation.set(transformation.indexOf(higherPosition), Originalkey.length()-i);
        }
            
        System.out.print(transformation.toString());
    }

}