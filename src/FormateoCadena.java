public class FormateoCadena {
    public static void main(String[] args) {
        System.out.println("***formateo de cadenas***");

        String nombre = "jose eduardo acosta garcia";
        int edad = 30;
        double salario = 2.0000;

        //String format
        String mensaje = String.format("nombre: %s, edad: %d, salario: %.4f", nombre, edad, salario);
        System.out.println(mensaje);

        //metodo printf
        System.out.printf("nombre: %s, edad: %d, salario: $%.4f%n", nombre, edad, salario);

        //formateo con bloque de texto
        mensaje = """
                %nDetalle Persona:\s
                -----------------
                \tnombre: %s
                -----------------
                \tedad: %d
                -----------------
                \tsalario: $%.4f
                """.formatted(nombre,edad,salario);
        System.out.printf(mensaje);


    }
}
