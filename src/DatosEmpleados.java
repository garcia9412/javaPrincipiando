import java.util.Scanner;

public class DatosEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //datos de un empleado
        System.out.println("***Datos Del Empleado*** ");
        System.out.print("nombre:");
        String nombreEmpleado = sc.nextLine();

        //datos edad
        System.out.print("Edad: ");
        String edad = sc.nextLine();
        int edad1 = Integer.parseInt(edad);

        //salario del empleado
        System.out.print("salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();


        //es jefe de departamento
        System.out.println("jefe de planta true/false");
        String jefe = sc.nextLine();

        //imprimir datos
        System.out.println("nombreEmpleado = " + nombreEmpleado);
        System.out.println("edad1 = " + edad1 + "años");
        System.out.println("salario = " + salario);
        System.out.println("jefe = " + jefe);


    }
}
