package Paquete1;
import java.util.Scanner;

public class Uso_tallas {
    //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    /* Con "enum" puedo definir una clase con opciones limitados de resultados,
    por eso se llama clase enumerada */
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        private final String abreviatura;

        private Talla(final String abreviatura){ /* "private" porque "enum" no admite que se creen instancias de la clase usando "new" */
            this.abreviatura = abreviatura;
        }
        public String get_abreviatura(){
            return "La abreviatura es " + abreviatura + ". ";
        }
    }
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
        final String entrada_datos = entrada.next().toUpperCase();
        final Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        entrada.close();
        System.out.println("La talla es " + la_talla);
        System.out.println(la_talla.get_abreviatura());
    }
}