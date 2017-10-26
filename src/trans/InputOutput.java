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
        code.replaceAll("\\s*$","");
        if( key != null){
            decodification = result.DecodeWithKey(key,code);
        }else{
            decodification = result.DecodeWithBruteForce();
        }
        System.out.println(Arrays.deepToString(decodification));
    }
}