package Paquete1;

public class ejemplo_matriz2d {
    public static void main(String[] args) {
        
        double acumulado;
        double interes = 0.10;

        double[][] saldo = new double[5][6];

        for (int j = 0; j < 6; j++){
            saldo[0][j] = 10000;
            acumulado = 10000;

            for (int i = 1; i < 5; i++){
                acumulado *= 1+interes;
                saldo[i][j] = acumulado;
            }
            interes += 0.01;
        }

        for (double[] i: saldo){
            for (double j: i){
                System.out.printf("%1.2f",j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}