package VariaveisJAVA;

public class variaveisJava {

    public static void main(String[] args) {
        System.out.println("Revisão Curso Java DevDojo YOUTUBE");

        //Tipos Primitivos
        int tonelada = 1000;
        char tipoSanguineo = 'O';
        char simbolo = '+';
        short idade = 29;
        double peso = 120;
        float dataDoMes = 20F;
        long velocidadeDaLuz = 300000L;
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("\n");

        System.out.println("Uma tonelada é igual a " + tonelada);

        System.out.println("\n");

        System.out.println("O tipo sanguineo " + tipoSanguineo + simbolo + "é o mais comum no mundo todo");

        System.out.println("\n");

        System.out.println("Minha idade daqui dois anos será " + idade);

        System.out.println("\n");

        System.out.println("Eu cheguei a pesar " + peso);

        System.out.println("\n");

        System.out.println("A velocidade da luz é igual a " + velocidadeDaLuz);

        System.out.println("\n");

        System.out.println("Eu faço aniversário todo dia " + dataDoMes +
                " De Dezembro");

        System.out.println("\n");

        System.out.println("Já cheguei a pesar 120kg?");

        //Operador Ternário + class String (String não é um tipo primitivo, mas sim uma classe)

        String resultado = peso >= 120 ? "Sim, já pesou" : "Não, nunca pesou";
        System.out.println(resultado);
    }
}
