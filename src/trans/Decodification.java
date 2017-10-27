package trans;

import java.util.*;

public class Decodification {
    
    protected Character[][] DecodeWithKey(String key, String code) {
        int symbols = code.length()/key.length();
        int overflow = code.length()%key.length();
        int count = 0;
        int rows = symbols;
        if (overflow > 1)rows++;
        Character solution[][] = new Character[key.length()][rows];
        ArrayList<Integer> transformation = KeyTransformation(key);
        
        for (int i = 0 ; i < key.length(); i++) {
            
            
            
            
            if(overflow > 1){
                for (int j = 0; j < symbols+1; j++) {
                    solution[i][j] = code.charAt(symbols*KeyTransformation(key).get(i)+j);
                    count++;
                }
            }else{
                for (int j = 0; j < symbols; j++) {
                solution[KeyTransformation(key).get(i)][j] = code.charAt(symbols*KeyTransformation(key).get(i)+j);
            }
            }
        }
            
            
        return solution;
    }

    protected Character[][] DecodeWithBruteForce() {
        return null;
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
            int position = MaxValue(transformation);
            transformation.set(position, 0);
            result.set(position, key.length() - (i+1));
        }
        System.out.println(result);
        return result;
    }
    
    private int MaxValue(ArrayList<Integer> transformation){
        int pointer = 0;
        for (int i = transformation.size()-1; i > 0; i--) {
            if (transformation.get(i) > transformation.get(pointer)) {
                pointer = i;
            }
        }
        return pointer;
    }

}