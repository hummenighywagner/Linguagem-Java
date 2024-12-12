package Entrada_De_Dados;
import java.util.Scanner;

public class Entrada_De_Dados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        System.out.println("Qual seu nome ?");
        nome = leitor.nextLine();

        System.out.println("\n");

        double idade;
        System.out.println("Agora digite a sua idade ?");
        idade = leitor.nextDouble();


        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);

    }
}
