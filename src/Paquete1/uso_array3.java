package Paquete1;

public class uso_array3 {
    public static void main(String[] args) {
        
        int[] matriz_aleatorio = new int[50];

        for (int i = 0; i < matriz_aleatorio.length; i++){
            matriz_aleatorio[i] = (int) Math.round(Math.random()*100);
        }

        int i = 0;
        for (int numeros: matriz_aleatorio){
            System.out.println(i + ". " + numeros + " ");
            i++;
        }
    }
    
}