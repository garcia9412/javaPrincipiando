public class subCadenas {
    public static void main(String[] args) {

        //subcadena
        String cadena1 = "hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //subString forma 1, con indice 0 hasta donde queremos subtraer eje: 0,4 imprime "hola"
        String subCadena = cadena1.substring(0, 4);
        System.out.println("subCadena = " + subCadena);

        String subCadena1 = cadena1.substring(5,10);
        System.out.println("subCadena1 = " + subCadena1);

        //subCadena forma 2 iniciamos con el indice y imprime desde el indice inicial hasta donde termina la cadena eje: 5, imprime desde m hasta la ultima osea "mundo"
        String subCadena2 = cadena1.substring(5);
        System.out.println("subCadena2 = " + subCadena2);




    }
}
