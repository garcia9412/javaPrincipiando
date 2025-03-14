import javax.swing.*;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer distintos tipos de datos
        Scanner sc = new Scanner(System.in);

        //datos de la edad
        System.out.print("Ingresa Tu Edad: ");
        int edad = sc.nextInt();
        System.out.print("edad = " + edad);

        //Tipo Double
        System.out.println();
        System.out.println("Ingresa Tu Altura: ");
        double altura = sc.nextDouble();
        System.out.println("altura = " + altura);

        //leer Tipo String

        sc.nextLine();
        System.out.print("Ingresa Tu Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("nombre = " + nombre);

        //conversion de datos de String a Int
        System.out.print("proporciona un valor entero: ");
        var enteroString = sc.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //conversion a float
        System.out.print("conversion a float: ");
        var Flotante = Float.parseFloat(sc.nextLine());
        System.out.println("verFlotante = " + Flotante);
    }
}
