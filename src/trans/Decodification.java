package trans;

import java.util.ArrayList;

public class Decodification {
    
    private String Originalkey;
    
    public void Input(InputOutput datos) {
        if( datos.key != null){
            Originalkey = datos.key;
            DecodeWithKey();
        }else{
            DecodeWithBruteForce();
        }
    }

    private void DecodeWithKey() {
        KeyTransformation();
        ArrayList<String> matrix = new ArrayList<>();
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
    }

}
