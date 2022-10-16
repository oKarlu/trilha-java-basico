package operadores;

public class Operadores {
    public static void main(String[] args) {

        //Atribuição
        String nome = "Carlos";
        int idade = 20;
        double peso = 70.1;
        char sexo = 'M';

        //Aritmético
        double soma = 11.7 + 16.4;
        int subtracao = 110 - 20;
        int multiplicacap = 10 * 5;
        int divisao = 50 / 2;
        int modulo = 20 % 2;
        double resultado = (5 * 5) + (100 / 2);

        //concatenacao
        System.out.println("Nome: " + nome + " Idade: " + idade + " Peso: " + peso);

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println("Concatenacao 1: " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("Concatenacao 2: " + concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("Concatenacao 3: " + concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("Concatenacao 4: " + concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("Concatenacao 5: " + concatenacao);

        //unario
        int numero = 5;
        numero = - numero;
        System.out.println("Numero Negativo: " + numero);

        numero = numero * -1;
        System.out.println("Numero Positivo: " + numero);

        //incrementar
        numero++;
        System.out.println("Numero Incremento: " + numero);
        //incrementar antes
        ++numero;
        System.out.println("Numero Incremento antes: " + numero);
        //decrementar
        numero--;
        System.out.println("Numero Decremento: " + numero);
        //decrementar antes
        --numero;
        System.out.println("Numero Decremento antes: " + numero);

    }
}
