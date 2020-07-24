package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {
    public static void main(String[] args) {
        
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Cristian", 50000, 2020, 5, 18);
        lasPersonas[1] = new Alumno("Victor", "aeronáutica");

        for(Persona p: lasPersonas){
            System.out.println(p.get_nombre() + p.get_descripcion());
        }

    }
}

abstract class Persona {

    private String nombre;

    public Persona(String nom){
        nombre = nom;
    }
    public String get_nombre(){
        return "Se llama " + nombre + ". ";
    }
    public abstract String get_descripcion();
}

class Empleado2 extends Persona{
    
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;

    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public Empleado2(String nom){ /* Esto es una sobrecarga de constructor, 
        permite flexibilizar en caso de no poder/saber completar todos los argumentos */
        this(nom, 30000, 2000, 1, 1); // esto llama automáticamente al constructor previo
    }

    public double get_sueldo(){ // getter
        return sueldo;
    }
    public Date get_fechaContrato(){ // getter
        return altaContrato;
    }
    public void subeSueldo(double porcentaje){ // setter
        sueldo *= 1 + porcentaje/100;
    }
    public String get_descripcion() {
        return "Este empleado ID=" + Id + " con un sueldo de " + sueldo + ". ";
    }
}

class Alumno extends Persona{
    
    private String carrera;

    public Alumno(String nom, String car){
        super(nom);
        carrera = car;
    }

    public String get_descripcion() {
        return "Este alumno estudia " + carrera + ". ";
    }
}