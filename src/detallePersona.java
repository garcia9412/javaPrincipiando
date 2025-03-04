import java.util.*;

public class detallePersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa tu nombre completo");
        String nombre = sc.nextLine();

        System.out.println("ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("ingresa tu altura en mts");
        double altura = sc.nextDouble();
        System.out.println("pais de origen");
        String pais = sc.next();
        System.out.println("casado o soltero. casado - c, soltero - s.");
        char estadoCivil = sc.next().charAt(0);

        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura);
        System.out.println("pais: " + pais);
        System.out.println("estado civil: " + estadoCivil);







    }
}
