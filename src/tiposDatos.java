public class tiposDatos {
    public static void main(String[] args) {
        //Enteros
        byte tipoByte = 127;//-127 a 127
        System.out.println("tipoByte = " + tipoByte);
        
        //short
        short tipoShort = 32000;//de -32000 a 32000
        System.out.println("tipoShort = " + tipoShort);

        //Enteros
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        //Long
        long tipoLong = 9876543210L;//con L al final para indicar que es tipo float
        System.out.println("tipoLong = " + tipoLong);

        //float
        float tipoFloat = 3.14F;//con F al final para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);

        //double
        double tipoDuble = 3.1444;
        System.out.println("tipoDuble = " + tipoDuble);

        //TIPOS DE DATOS PRIMITIVOS
        //Char
        char tipoChar = 'M';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano
        boolean tipoBoolean = false;//verdadero o falso
        System.out.println("tipoBoolean = " + tipoBoolean);

        //String tipo Object
        String nombre = "jose";// si no tiene asignacion el valor por default es null.
        System.out.println("nombre = " + nombre);


    }
}
