package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Victor");
        Empleados trabajador2 = new Empleados("Guillermo");

        trabajador1.cambio_sector("RRHH");

        System.out.println(trabajador1.estadoEmpleado());
        System.out.println(trabajador2.estadoEmpleado());
        System.out.println(Empleados.get_idsiguiente());
    }
    
}

class Empleados{
    private final String nombre;
    private String sector;
    private int Id;
    private static int IdSiguiente=1; // "static" hace que esta variable sea una copia única para todas las instancias

    public Empleados(String nom){
        nombre = nom;
        sector = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambio_sector(String sector){ // setter
        this.sector = sector;
    }
    public String estadoEmpleado(){ // getter
        return "El nombre es: " + nombre + ", el sector es: " + sector + " y cuyo ID=" + Id;
    }
    public static String get_idsiguiente(){ // los métodos "static" solo pueden acceder a variables también "static"
        return "El siguiente Id es: " + IdSiguiente;
    }
}