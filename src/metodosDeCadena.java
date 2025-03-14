public class metodosDeCadena {
    public static void main(String[] args) {
        //Metodos De Cadena
        //metodo length: cantidad de letras que tiene nuestra cadena
        String longitudNombre = "jose eduardo";
        System.out.println("cantidad de letras en la variable longuitudNombre: " + longitudNombre.length());
        String longitudApellido = "acosta garcia";
        System.out.println("cantidad de letras en la varible longuitudApellido: " + longitudApellido.length());

        int longitudTotal = longitudNombre.length() + longitudApellido.length();
        System.out.println("la longuitud total de las variables son: " + longitudTotal);

        //remplazar cadenas o letras
        System.out.println("** Remplazando con Replace");
        String nombre = "jose acosta";
        String apellido = "acosta garcia";
        System.out.println(nombre.replace("acosta","garcia"));
        
        //convertir a mayusculas
        System.out.println("*** Remplazando Por Mayusculas toUppercase ***");
        String nombre1 = "jose eduardo";
        String apellido1 = "acosta garcia";
        String nombreCompleto = nombre1.toUpperCase() + " " + apellido1.toUpperCase();
        System.out.println("nombreCompleto = " + nombreCompleto);

        //convertir a minusculas
        System.out.println("*** Remplazando Por Minusculas toLoWercase ***");
        String nombre2 = "JOSE EDUARDO";
        String apellido2 = "ACOSTA GARCIA";
        String nombreCompleto2 = nombre2.toLowerCase() + " " + apellido2.toLowerCase();
        System.out.println("nombreCompleto = " + nombreCompleto2);

        //eliminar Espacios al inicio y final de la cadena con .trim()
        String cadena3 = "    salome acosta  ";
        System.out.println("cadena3 = " + cadena3.trim());
    }
}
