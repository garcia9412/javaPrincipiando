import java.util.Scanner;

public class recetaCocina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //receta de cocina

        System.out.println("Carne EN Bistec");
        System.out.println("*** ingredientes de la receta ***");
        System.out.println("ingrediente1");
        String ingrediente1 = sc.nextLine();

        System.out.println("ingrediente2");
        String ingrediente2 = sc.nextLine();

        System.out.println("ingrediente3");
        String ingrediente3 = sc.nextLine();

        System.out.println("ingrediente4");
        String ingrediente4 = sc.nextLine();

        System.out.println("ingrediente5");
        String ingrediente5 = sc.nextLine();
        //tiempo de preparacion
        System.out.println("**tienpo Preparacion**");
        int tiempoPreparacion = sc.nextInt();
        sc.nextLine();

        System.out.println("Dificultad facil/media/alta");
        String nivel = sc.nextLine();

        System.out.println("RECETA COMPLETA DE CARNE BISTEC");
        System.out.println("ingredientes");
        System.out.println("-" + ingrediente1);
        System.out.println("-" + ingrediente2);
        System.out.println("-" + ingrediente3);
        System.out.println("-" + ingrediente4);
        System.out.println("**Tiempo De Preparacion");
        System.out.println("-" + tiempoPreparacion);
        System.out.println("**Dificultad**");
        System.out.println("-" + nivel);

    }
}
