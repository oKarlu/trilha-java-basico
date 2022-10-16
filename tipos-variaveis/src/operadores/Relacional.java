package operadores;

public class Relacional {
    public static void main(String[] args) {
        int numero1= 1;
        int numero2= 2;


        boolean resultado;


        //Versus equals
        resultado= numero1 == numero2;
        System.out.println("Numero 1 igual ao Numero 2: " + resultado);

        //Maior
        resultado = numero1 > numero2;
        System.out.println("Numero 1 maior que Numero 2: " + resultado);

        //Maior ou igual
        resultado= numero1 >= numero2;
        System.out.println("Numero 1 maior ou igual ao Numero 2: " + resultado);

        //Menor
        resultado= numero1 < numero2;
        System.out.println("Numero 1 menor que Numero 2: " + resultado);

        //Menor ou igual
        resultado= numero1 <= numero2;
        System.out.println("Numero 1 menor ou igual ao Numero 2: " + resultado);

        //diferente
        resultado= numero1 != numero2;
        System.out.println("Numero 1 diferente ao Numero 2: " + resultado);
    }
}
