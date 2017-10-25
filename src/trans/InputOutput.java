package trans;

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
    
}