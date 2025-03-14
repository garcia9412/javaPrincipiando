public class remplazarSubCadenas {
    public static void main(String[] args) {
        
        //remplazar subcadena
        var cadena = "hola mundo";
        System.out.println("cadena original = " + cadena);
        
        //remplazando "mundo"
        var cadena1 = cadena.replace("mundo", "todos");
        System.out.println("cadena1 = " + cadena1);

        //remplazo de "hola"
        var cadena2 = cadena.replace("hola", "adios");
        System.out.println("cadena2 = " + cadena2);
    }
}
