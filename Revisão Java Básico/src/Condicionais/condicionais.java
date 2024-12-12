package Condicionais;

import java.util.Scanner;

public class condicionais {

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

            if (nome.equals("João") || nome.equals("Maria") || nome.equals("Enzo")) {
                System.out.println("Seu nome está entre os mais comuns");
            }else if (nome.equals("José") || nome.equals("Josefa")) {
                System.out.println("Você tem mais de 70 anos kkkk");
            }else {
                System.out.println("Seu nome não é tão conhecido, muito prazer!");

            }

        }
    }

