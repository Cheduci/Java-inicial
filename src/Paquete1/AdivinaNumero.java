package Paquete1;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args){

        int aleatorio = (int) (Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;
        do {
            intentos++;
            System.out.println("Introduce un número: ");
            numero = entrada.nextInt();
            if (aleatorio<numero){
                System.out.println("Es más bajo");
            }
            else if (numero<aleatorio){
                System.out.println("Es más alto");
            }
        }while (numero != aleatorio);
        System.out.println("Has adivinado, el número es " + aleatorio);
        System.out.println("Cantidad de intentos: " + intentos);
        entrada.close();
    }
    
}