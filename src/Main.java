import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Define o leitor do teclado
        Scanner leitor = new Scanner(System.in);

        //Define a variáveis locais
        int x, y;

        //Le:
        System.out.print("informe o 1º valor: ");
        x = leitor.nextInt();

        System.out.print("informe o 2º valor: ");
        y = leitor.nextInt();

        //Cria a instancia da classe matematica utilizando o construtor
        Matematica mat = new Matematica(x, y);

        // Imprime o resultado das operações atraves
        // de chamadas aos métodos da classe Matemática
        System.out.println("--------------------"); //Apenas para organizar a saída
        System.out.println("O valor da soma é: " + mat.Soma());
        System.out.println("O valor da subtração é: " + mat.Subtracao());
        System.out.println("O valor da multiplicação é: " + mat.Multiplicacao());
        System.out.println("O valor da divisão é: " + mat.Divisao());
        System.out.println("--------------------"); //Apenas para organizar a saída

    }
}