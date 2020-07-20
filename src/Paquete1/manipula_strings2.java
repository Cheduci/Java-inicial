public class manipula_strings2 {
    public static void main(String[] args) {

        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        String frase_resumen = frase.substring(10, 29);
        System.out.println(frase_resumen + "irnos a la playa y" + frase.substring(28));
    }
    
}