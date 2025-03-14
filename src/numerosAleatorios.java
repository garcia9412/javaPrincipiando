import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
         //aleatorio con ramdom
        System.out.println("Numeros Aleatorios");
        Random ramdon = new Random();
        
        
        //Generar numero aleatorio entre 0 y 9
        var aleatorio = ramdon.nextInt(9);
        System.out.println("aleatorio = " + aleatorio);

        //generar numero aleatorio entre 1 y 10
        var aleatorio1 = ramdon.nextInt(10) + 1;
        System.out.println("aleatorio1 = " + aleatorio1);

        //numero flotante entre 0.0 y 1.0
        var aleatorio2 = ramdon.nextFloat();
        System.out.println("aleatorio2 = " + aleatorio2);

        //aleatorio con letras
        char letraMinuscula = (char) ('a' + ramdon.nextInt(26)); // Letra entre 'a' y 'z'
        char letraMayuscula = (char) ('A' + ramdon.nextInt(26)); // Letra entre 'A' y 'Z'
        System.out.println("letraMayuscula = " + letraMayuscula);
    }
}
