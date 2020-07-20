package Paquete1;
import java.util.Scanner;

public class Entrada_ejemplo1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
        /* "new" es necesario para que Scanner pueda tomar info de la consola.
        Todo esto es para poder hacer el "input" */
        System.out.println("Introduce tu nombre, por favor: ");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce edad: ");
        int edad = entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " tienes " + edad + " años.");
        
        entrada.close(); // Es necesario cerrar la variable del scanner al finalizar
    }
    
}