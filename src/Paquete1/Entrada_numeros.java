package Paquete1;
import javax.swing.JOptionPane;

public class Entrada_numeros {
    public static void main(String[] args){

        String num1 = JOptionPane.showInputDialog("Introduce un numero: ");
        double x = Double.parseDouble(num1);
        System.out.print("La raiz de " + num1 + " es: ");
        System.out.printf("%1.2f", Math.sqrt(x));

    }
}