package Paquete1;

import javax.swing.JOptionPane;

public class Acceso_aplicacion {
    public static void main(String[] args){

        String clave = "Matias";
        String pass = "";

        while (clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduzca la contraseña: ");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta");
    }
    
}