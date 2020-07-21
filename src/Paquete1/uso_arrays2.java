package Paquete1;
import javax.swing.JOptionPane;

public class uso_arrays2 {
    public static void main(String[] args) {
        
        String[] paises = new String[8];

        /* paises[0] = "Arg";
        paises[1] = "Bol";
        paises[2] = "Uru";
        paises[3] = "Par";
        paises[4] = "Bra";
        paises[5] = "Chi";
        paises[6] = "Per";
        paises[7] = "Ecu"; */
        
        /* for (int i = 0; i < paises.length; i++){

            System.out.println("País " + i + " = " + paises[i]);
        } */
        
        for (int i = 0; i < 8; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce país " + i);
        }

        int i = 0;
        for (String elemento: paises){
            i++;
            System.out.println("País " + i + " = " + elemento);
        }
    }
    
}