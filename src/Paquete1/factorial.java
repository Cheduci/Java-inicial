package Paquete1;
import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        for (int i = numero; i > 0; i--){
            resultado *= i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);

    }
    
}