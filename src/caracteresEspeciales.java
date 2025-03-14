public class caracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres Especiales
        // \n - salto de linea
        var cadena1 = "hola\nmundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulador
        var cadena2 = "\thola\tjose";//espacio de tabulador
        System.out.println("cadena2 = " + cadena2);

        //comillas simples
        var cadena3 = "hola\'mundo";//nos agrega una simple comiila simple 
        System.out.println("cadena3 = " + cadena3);
        //comilla doble
        var cadena4 = "hola \" mundo";//agrega unas comillas doble
        System.out.println("cadena4 = " + cadena4);
    }
}
