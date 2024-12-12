package OperadoresLogc_e_Matm;

public class operadores {
    public static void main(String[] args) {

        int a = 20;
        double b = 30.2;
        short c = 10;
        double operacao1 = a + b * c;
        double operacao2 = a * b * c;
        double operacao3 = a - c + b;
        double operacao4 = a / c * b;

        System.out.println(operacao1);
        System.out.println(operacao2);
        System.out.println(operacao3);
        System.out.println(operacao4);

        if (operacao1 == operacao2) {
            System.out.println("O valor da Op 1 e 2 são iguais");
        } else if (operacao1 == operacao3) {
            System.out.println("As ops 1 e 3 são iguais");
        } else if (operacao4 + operacao1 >= 10) {
            System.out.println("Operacões 3 e 4 são maiores que 10");
        } else {
            System.out.println("Nenhuma das condições atende");
        }

        boolean operacao1EMaiorQueAOperacao2 = true;
        boolean operacao1EIgualAOperacao2 = false;
        boolean operacao3EMaiorAOperacao4 = false;
        boolean operacao3EigualAOperacao4 = false;


        if (operacao1EIgualAOperacao2 && operacao1EMaiorQueAOperacao2 == true) {
            System.out.println("Operação 1 é maior que a 2 e são iguais");

        } else {
            System.out.println("Resultado 1 é maior que 2 e são diferentes!");
        }
    }
}


