import java.util.Scanner;

public class generadorEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio generador de email
        //opcion 1
        System.out.println("***Generador De Email ***");
        var nombre = "jose eduardo acosta";
        System.out.println(nombre);

        var empresa = "ordecol";
        var dominio = "com.co";
        var email = nombre.replace(" ", ".")+ "@" + empresa + "." + dominio;
        System.out.println("email = " + email);

        //opcion 2 entrada con scanner
        System.out.println("*** Generador De Email ***");

        //pedir nombre completo al usuario
        System.out.println("Nombre Completo");
        var nombre1 = sc.nextLine().toLowerCase().trim();

        //nombre de la empresa
        System.out.println("Nombre De La Empresa");
        var empresa1 = sc.nextLine().toLowerCase().trim();

        //dominio de empresa
        System.out.println("Dominio De Empresa");
        var dominio1 = sc.nextLine().trim().toLowerCase();

        //union
        var email1 = nombre1.replace(" ", ".") + "@" + empresa1 + "." + dominio1;
        System.out.println("Tu Email Es: " + email1);

        sc.close();
    }
}
