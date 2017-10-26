package trans;

import java.util.*;

public class Decodification {
    
    private String Originalkey;
    private String Codification;
    
    public void Input(InputOutput datos) {
        Originalkey = datos.key;
        Codification = datos.code;
        if( datos.key != null){
            DecodeWithKey(Originalkey, Codification);
        }else{
            DecodeWithBruteForce();
        }
    }

    protected Character[][] DecodeWithKey(String key, String code) {
        int symbols = code.length()/key.length();
        int overflow = code.length()%key.length();
        Character solution[][] = new Character[symbols][overflow];
        for (int i = 0; i < overflow; i++) {
            for (int j = 0; j < symbols; j++) {
                solution[j][i] = code.charAt(symbols*KeyTransformation(key).get(i)+j);
            }
        }
        
        for (int i = overflow; i < key.length(); i++) {
            for (int j = 0; j < symbols; j++) {
                solution[j][i] = code.charAt(symbols*KeyTransformation(key).get(i)+j);
            }
        }
        
        return solution;
    }

    private void DecodeWithBruteForce() {
    }

    private ArrayList<Integer> KeyTransformation(String key ) {
        ArrayList<Integer> transformation = new ArrayList<>();
        ArrayList<Integer> result;
        String keyToUpper = key.toUpperCase();
        
        
        for (int i = 0; i < keyToUpper.length(); i++) {
            transformation.add((int) keyToUpper.charAt(i) - 64);
        }
        
        result = (ArrayList<Integer>) transformation.clone();
        
        for (int i = 0; i < key.length(); i++) {
            int position = transformation.indexOf(Collections.max(transformation));
            transformation.set(position, 0);
            result.set(position, key.length() - (i+1));
        }
        return result;
        
    }

}