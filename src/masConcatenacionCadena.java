public class masConcatenacionCadena {
    public static void main(String[] args) {
        //mas formas de concatenar cadenas en java
        // para concatenar se usa mas el signo aritmetico de +
        var cadena1 = "hola";
        var cadena2 = "mundo";
        var cadena3 = cadena1 + cadena2;
        System.out.println("cadena3 con + = " + cadena3);

        //metodo concat. poco usado
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);

        //cancatenacion con metodo StringBuilder sirve para muchas concatenaciones de bucle.
        var sb = new StringBuilder();
        sb.append(cadena1);
        sb.append(" ");
        sb.append(cadena2);
        var resultado = sb.toString();
        System.out.println("resultado con StringBuilder = " + resultado);

        //StringBuffer: cuando trabajamos con varios procesos a la vez
        //apcion 1:
        var buffer = new StringBuffer();
        buffer.append(cadena1).append(" ").append(cadena2);
        resultado = buffer.toString();
        System.out.println("resultado2 con la opcion 2 de buffer = " + resultado);

    }
}
