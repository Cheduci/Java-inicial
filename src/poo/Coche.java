package poo;

public class Coche {
    /* Cuando se construye un módulo no se usa el "main".
    Se recomienda usar mayúscula al definir una clase
    */
    private int ruedas; // agregando "private" adelante, se encapsula la propiedad
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    public Coche(){

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        color = "rojo";
    }

    public String dime_ruedas() {
        return "El auto tiene " + ruedas + " ruedas";
    }
    /* esto es un Getter, permite obtener información de una propiedad encapsulada
    Debe llevar un return siempre */
    public String dime_largo() {
        return "El largo del coche es " + largo + "cm";
    }
    public String dime_ancho() {
        return "El ancho del coche es " + ancho + "cm";
    }
    public String dime_motor() {
        return "El motor del coche tiene " + motor + "ml de cilindrada";
    }
    public String dime_peso() {
        return "El peso del pesa " + peso + "kg.";
    }

    public void set_color(String color_Coche){
        color = color_Coche;
    }
    /* Esto es un Setter, permite asignar un valor a una propiedad
    al llevar "void" indica que no devuelve nada*/
    public String dime_color(){
        return "El color del coche es " + color;
    }
}