import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables

        int edad1 = 31;
        double precio = 300.40;
        boolean disponible = true;
        char genero = 'M';

        System.out.println(edad1);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        System.out.println("ingresa tu edad");
        int edad = sc.nextInt();
        if (edad < 18 ){
            System.out.println("eres menor de edad");
        } else if (edad >= 18 && edad < 50) {
            System.out.println("eres mayor de edad");
        } else if (edad >= 50 && edad <= 100) {
            System.out.println("estas entrando a la vejez");
        }else {
            System.out.println("dato incorrecto");
        }
        sc.close();


        //dertalles de un libro
        String tiuloLibro = "el señor de los anillos";
        int añolibro = 1954;
        boolean disponibleventa = true;

        double precio1 = 500.50;
        System.out.println("titulo: " + tiuloLibro);
        System.out.println("año del libro: " + añolibro);
        if (disponibleventa){
            System.out.println("disponible: si");
        }else {
            System.out.println("disponible: no");
        }
        System.out.println("precio del libro: " + precio1);






    }
}
