public class ejercicios {
    public static void main(String[] args) {

        System.out.println("*** tienda en linea (detalle producto ***)");
        String nombreProducto = "zapatillas";
        double precio = 150.200;
        int cantidadDisponible = 50;
        boolean disponibleVenta = true;

        System.out.println("nombreProducto = " +nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponible = " + disponibleVenta);

        //tipos De Datos Normales
        System.out.println("** Datos Personales **");
        String nombreCompleto = "jose eduardo acosta garcia";
        int edad = 30;
        String pais = "colombia";

        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("edad = " + edad);
        System.out.println("pais = " + pais);

        //Tipo Var:para definir variables locales dentro de metodos
        //con var hay que definir el valor, si o lo definimos lanza un error
        System.out.println("** Datos Personales 2 **");
        var nombreCompleto1 = "jose eduardo";
        var edad1 = 30;
        var pais1 = "colombia";

        System.out.println("nombreCompleto1 = " + nombreCompleto1);
        System.out.println("edad1 = " + edad1);
        System.out.println("pais1 = " + pais1);


    }
}
