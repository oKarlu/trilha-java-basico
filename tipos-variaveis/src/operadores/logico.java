package operadores;

public class logico {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        } else {
            System.out.println("nenhuma das alternativas é verdadeira");
        }

        if(condicao1 && (10 > 1)){
            System.out.println("as duas condições são verdadeiras");
        }
    }
}
