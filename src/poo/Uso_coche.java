package poo;

public class Uso_coche {
    public static void main(String[] args) {
        
        Coche micoche = new Coche(); // Renault es una instancia del objeto Coche
        /* El "Coche" el inicio de la línea es la clase declarada
        la palabra que sigue es el nombre de la variable
        */
        micoche.set_color("turquesa");
        System.out.println(micoche.dime_color());
    }
    
}