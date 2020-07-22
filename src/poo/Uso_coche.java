package poo;

public class Uso_coche {
    public static void main(String[] args) {
        
        Coche micoche = new Coche(); // Renault es una instancia del objeto Coche
        /* El "Coche" del inicio de la línea es la clase declarada
        la palabra que sigue es el nombre de la variable
        */
        micoche.set_color("turquesa");

        System.out.println(micoche.get_estado());
        System.out.println(micoche.get_color());

        micoche.set_asientos("si");
        System.out.println(micoche.get_asientos());
    }
    
}