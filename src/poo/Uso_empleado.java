package poo;
import java.util.*;

/* cuando se crean todas las clases en un mismo archivo, solo 
el main debe ser público */
public class Uso_empleado {
    public static void main(String[] args) {
        /* Empleado empleado1 = new Empleado("Sergio", 50050, 2020, 7, 22);
        Empleado empleado2 = new Empleado("Cristian", 60070, 2019, 5, 18);
        Empleado empleado3 = new Empleado("Mabel", 70050, 2018, 6, 7);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println(empleado1.get_nombre() + " cuyo sueldo es " + empleado1.get_sueldo() + " y fecha de alta fue " + empleado1.get_fechaContrato());
        System.out.println(empleado2.get_nombre() + " cuyo sueldo es " + empleado2.get_sueldo() + " y fecha de alta fue " + empleado2.get_fechaContrato());
        System.out.println(empleado3.get_nombre() + " cuyo sueldo es " + empleado3.get_sueldo() + " y fecha de alta fue " + empleado3.get_fechaContrato()); */

        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Sergio", 50050, 2020, 7, 22);
        misEmpleados[1] = new Empleado("Cristian", 60070, 2019, 5, 18);
        misEmpleados[2] = new Empleado("Mabel", 70050, 2018, 6, 7);
        misEmpleados[3] = new Empleado("Gustavo");
        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }
        for(Empleado i: misEmpleados){
            System.out.println(i.get_nombre() + " cuyo sueldo es " + i.get_sueldo() + " y fecha de alta fue " + i.get_fechaContrato());
        }
    }
    
}

class Empleado{

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia){        
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom){ /* Esto es una sobrecarga de constructor, 
        permite flexibilizar en caso de no poder/saber completar todos los argumentos */
        this(nom, 30000, 2000, 1, 1); // esto llama automáticamente al constructor previo
    }
    
    public String get_nombre(){ // getter
        return "El nombre del empleado es " + nombre;
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
}

class Jefatura extends Empleado{

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);

    }

    public void set_incentivo(double b){ // setter
        incentivo = b;
    }

    public double get_sueldo(){ // getter
        double sueldoJefe = super.get_sueldo();
        return sueldoJefe + incentivo;
    }
}