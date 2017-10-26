package trans;

public class DecodeTransposition {
    
    public static void main(String [] args){
        InputOutput datos = new InputOutput();
        datos.leerDatos();
        Decodification resultado = new Decodification();
        resultado.Input(datos);
    }
}