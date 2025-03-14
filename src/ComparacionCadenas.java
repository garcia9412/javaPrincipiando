public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion De Cadenas (pool de cadenas)

        String cadena1 = "java";
        String cadena2 = "java";
        //comparacion De Cadenas (==) Compara la Reerencia
        System.out.println("la cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);

        //para compracion de contenido o valor de la variable es con el metodo .equals
        boolean cadena3 = cadena1.equals (cadena2);
        System.out.println(cadena3);
    }
}
