package Paquete1;
import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {
    public static void main(String[] args){

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola " + nombre_usuario + " el año que viene tendras " + (edad_usuario+1) + " años.");
    }
}