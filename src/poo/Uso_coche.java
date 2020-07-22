package poo;
import javax.swing.JOptionPane;

public class Uso_coche {
    public static void main(String[] args) {
        
        Coche micoche = new Coche(); // Renault es una instancia del objeto Coche
        /* El "Coche" del inicio de la línea es la clase declarada
        la palabra que sigue es el nombre de la variable
        */
        micoche.set_color(JOptionPane.showInputDialog("Color del coche?"));

        System.out.println(micoche.get_estado());
        System.out.println(micoche.get_color());

        micoche.set_asientos(JOptionPane.showInputDialog("Lleva asientos de cuero?"));
        System.out.println(micoche.get_asientos());

        micoche.set_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(micoche.get_climatizador());

        System.out.println(micoche.get_peso_coche());

        System.out.println("El precio del coche es " + micoche.precio_coche());
    }
    
}