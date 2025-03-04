public class cadenasJava {
    public static void main(String[] args) {

        //Tipos De Cadena
        System.out.println("*** manejo de cadenas ***");

        String cadena1 = "hola";
        String cadena2 = new String("mundo");
        String cadena3 = cadena1 + " " + cadena2;
        System.out.println(cadena3);

        //Cadena de lines de bloque
        String cadena4 = """
                este es un texto de multilinea,
                o de bloque
                """;
        System.out.println(cadena4);

    }
}
