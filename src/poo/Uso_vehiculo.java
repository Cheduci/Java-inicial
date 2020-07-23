package poo;

public class Uso_vehiculo {
    public static void main(String[] args) {
        
        Coche micoche1 = new Coche();
        micoche1.set_color("turquesa");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.set_color("azul");
        mifurgoneta1.set_climatizador("si");
        mifurgoneta1.set_asientos("si");

        System.out.println(micoche1.get_estado() + " " + micoche1.get_color() + " " + micoche1.get_peso_coche());
        System.out.println(mifurgoneta1.get_estado() + " " + mifurgoneta1.get_datosFurgoneta() + " " + mifurgoneta1.get_peso_coche());
    }
    
}