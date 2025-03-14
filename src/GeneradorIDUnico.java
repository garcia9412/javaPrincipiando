import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //generador id unico
        System.out.print("Ingresa Tu Nombre: ");
        String nombre = sc.nextLine().toUpperCase();
        System.out.print("ingresa Tu Apellido: ");
        String apellido = sc.nextLine().toUpperCase();
        System.out.print("ingresa año de nacimiento: ");
        int añoNacimiento = sc.nextInt();
        //subtraer iniciales con subCadena
        String iniNombre = nombre.substring(0,2);
        String iniApellido = apellido.substring(0,2);
        String año = String.valueOf(añoNacimiento).substring(2,4);//convierte de String a int



        Random random = new Random();
        int aleatorio = random.nextInt(9999)+1;
        String alea = String.format("%04d", aleatorio);//%04d nos asegura que siempre aroojara 4 numeros asi sea agregando 0
        System.out.println("alea = " + alea);

        //resultado
        System.out.println("***GENERADOR DE ID***");
        System.out.println("tu ID Es:" + iniNombre + iniApellido + año +alea);


    }
}
