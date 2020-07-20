package Paquete1;
public class manipula_strings {
    public static void main(String[] args) {

        String nombre = "Matías";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
        int ultima_letra = nombre.length() - 1;
        System.out.println("La última letra de " + nombre + " es " + nombre.charAt(ultima_letra));
    }
    
}