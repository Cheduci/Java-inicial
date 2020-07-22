package poo;

public class Coche {
    /* Cuando se construye un módulo no se usa el "main".
    Se recomienda usar mayúscula al definir una clase
    */
    private int ruedas; // agregando "private" adelante, se encapsula la propiedad
    private int largo, ancho, motor, peso, peso_plataforma;
    private String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    public Coche(){ // constructor de instancia

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        color = "rojo";
        peso_plataforma = 500;
    }

    public String get_estado() {
        return "El auto tiene " + ruedas + " ruedas, mide " + largo + " cm de largo, " + ancho + " cm de ancho, tiene " + motor + " ml de cilindrada, la plataforma pesa " + peso + " kg.";
    }
    /* esto es un Getter, permite obtener información de una propiedad encapsulada
    Debe llevar un return siempre */

    public void set_color(String color_Coche){
        color = color_Coche;
    }
    /* Esto es un Setter, permite asignar un valor a una propiedad
    al llevar "void" indica que no devuelve nada*/
    public String get_color(){
        return "El color del coche es " + color;
    }
    
    public void set_asientos(String asientos_cuero){ // setter
        if (asientos_cuero.equalsIgnoreCase("si")) { // manera correcta de comparar strings
            this.asientos_cuero = true;
        }
        else{
            this.asientos_cuero = false;
        }
    }
    public String get_asientos(){ // getter
        if (asientos_cuero == true){
            return "El coche tiene asientos de cuero";
        }
        else{
            return "El coche tiene asientos de serie";
        }
    }

    public void set_climatizador(String climatizador){ // setter
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }
        else{
            this.climatizador = false;
        }
    }
    public String get_climatizador(){ // getter
        if (climatizador == true){
            return "El coche tiene climatizador";
        }
        else{
            return "El coche no tiene climatizador";
        }
    }

    public String get_peso_coche(){ /* setter + getter
        normalmente no se recomienda usarlo, pero se puede */
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;

        if (asientos_cuero == true){
            peso_total += 50;
        }

        if (climatizador == true){
            peso_total += 20;
        }
        
        return "El peso del coche es " + peso_total + " kg";
    }

    public int precio_coche(){ // getter
        
        int precio_final = 10000;

        if (asientos_cuero == true){
            precio_final += 2000;
        }
        if (climatizador == true){
            precio_final += 1500;
        }

        return precio_final;
    }
}