import java.util.Scanner;

@SuppressWarnings("ALL")
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        println("Digite o primeiro parametro");
        int parametroUm = terminal.nextInt();
        println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            // Imprimir a mensagem : O segundo parametro deve ser maior que o primeiro
            println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // Validar se parametroUm é maior que parametroDois e lançar uma exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++){
            println("Imprimindo o número " + i);
        }
    }
    static void println (Object object) {
        System.out.println(object);
    }
}
