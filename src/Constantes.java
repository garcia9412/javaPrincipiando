public class Constantes {
    public static void main(String[] args) {
        //definir una constante en java es con FINAL
        //una constante en la variable de define en mayuscula, la constante final nunca se puede modificar

        System.out.println("*** constantes en java ***");
        final int DIAS_SEMANA = 7;//no podemos utilizar la variable definida con final
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);

        final double PI = Math.PI;
        System.out.printf("PI=%.2f%n ", PI);//para mostrar solo dos decimales con printf y concatenamos con un , coma.

        //EJERCICIOS
        System.out.println("*** reserva hotelera ***");
        final String nombreDelCliente = "jose eduardo acosta garcia";
        final int diasEstadia = 3;
        final float tarifaPorNoche = 35.50000F;
        final boolean habitacionDisponible = true;

        System.out.println("nombreDelCliente = " + nombreDelCliente);
        System.out.println("diasEstadia = " + diasEstadia);
        System.out.println("tarifaPorNoche = " + tarifaPorNoche);
        System.out.println("habitacionDisponible = " + habitacionDisponible);

    }
}
