public class busquedaSubCadena {
    public static void main(String[] args) {
        //indexOf - devuelve el indice de la primera aparicion de la subcadena

        String cadena1 = "hola mundo";
        int indice1 = cadena1.indexOf("hola");//nose regresa el primer indice de la cadena, en este caso devuelve indice 0.
        System.out.println("indice1 = " + indice1);

        //lastIndexOf: devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice2 = " + indice2);

        //subCadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);
    }
}
