public class Calculos_Math {
    public static void main(String[] args){

        double raiz = Math.sqrt(9);
        System.out.println("La raíz cuadrada de 9 es " + raiz);

        float num1 = 5.58f;
        int resultado = Math.round(num1);
        System.out.println("El redondeo de " + num1 + " es " + resultado);

        double base = 5;
        double exponente = 3;
        int resultado2 = (int) Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es igual a " + resultado2);
    }
    
}