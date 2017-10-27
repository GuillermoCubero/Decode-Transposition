package trans;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    
    protected String code;
    protected String key;
    
    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el código que desea de codificar: ");
        code = sc.nextLine();
        System.out.print("Introduzca la clave que desea usar o intro para continuar: ");
        key  = sc.nextLine();
    }
    
    public void mostrarDatos(){
        Decodification result = new Decodification();
        Character[][] decodification;
        code = code.replaceAll(" ","");
        if( key != null){
            decodification = result.DecodeWithKey(key,code);
        }else{
            decodification = result.DecodeWithBruteForce();
        }
        printResult(decodification);
    }
    
    private void printResult(Character[][] decodification) {
        for (int j = 0; j < decodification[0].length; j++) {
            for (int i = 0; i < decodification.length; i++) {
                System.out.print(decodification[i][j] + " ");
            }
            System.out.println("");
        }
    }
}