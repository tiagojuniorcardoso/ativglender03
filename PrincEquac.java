import java.util.Scanner;

public class PrincEquac {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Digite o valor de a:");
        a = leia.nextDouble();

        System.out.println("Digite o valor de b:");
        b = leia.nextDouble();

        System.out.println("Digite o valor de c:");
        c = leia.nextDouble();

        if (a == 0) {

            System.out.println("O valor de a deve ser diferente de zero.");

        } else {

            Equacao equacao = new Equacao(a, b, c);

            delta = equacao.calculaDelta();

            System.out.println("Delta: " + delta);

            if (delta < 0) {

                System.out.println("A equacao nao possui raizes reais.");

            } else if (delta == 0) {

                System.out.println("A equacao possui apenas uma raiz.");

                System.out.println("X1: " + equacao.calculaX1());

            } else {

                System.out.println("A equacao possui duas raizes.");

                System.out.println("X1: " + equacao.calculaX1());

                System.out.println("X2: " + equacao.calculaX2());
            }
        }

        leia.close();
    }
}