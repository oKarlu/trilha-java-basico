package operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;
        String resultado;

        a = 5;
        b = 6;

        //Condicional usando a estrutura IF/ELSE
        if(a == b){
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
        System.out.println(resultado);

        //Mudança dos valores para condição da true;
        a = 6;
        b = 6;

        //Mesma estrutura usando operador ternario
        resultado = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }
}
