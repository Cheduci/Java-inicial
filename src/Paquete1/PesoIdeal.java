package Paquete1;
import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args){

        String genero="";

        do{
            genero = JOptionPane.showInputDialog("Ingrese su género");

        }while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm"));
        int pesoideal = 0;
        if(genero.equalsIgnoreCase("h")){
            pesoideal = altura - 110;
        }
        else if (genero.equalsIgnoreCase("m")){
            pesoideal = altura -120;
        }
        System.out.println("Su peso ideal es " + pesoideal + " kg");
    }
    
}