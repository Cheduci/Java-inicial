package Paquete1;

public class Uso_arrays {
    public static void main(String[] args) {
        
        /* int[] mi_matriz = new int[5];

        mi_matriz[0] = 5;
        mi_matriz[1] = 35;
        mi_matriz[2] = 85;
        mi_matriz[3] = -61;
        mi_matriz[4] = 64; */

        int[] mi_matriz = {5, 35, 85, -61, 64, 32, 8539, 984};

        for (int i = 0; i < mi_matriz.length; i++){
            System.out.println(i + " = " + mi_matriz[i]);
        }
    }
    
}