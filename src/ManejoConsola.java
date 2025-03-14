import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //introducir valore por consola
        Scanner sc = new Scanner(System.in);//in - input - entrada de datos
        System.out.println("ingresa tu nombre");
        var nombre = sc.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
