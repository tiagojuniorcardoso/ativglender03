import java.util.Scanner;

public class PrincTriang{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double c1, c2;

        System.out.println("Digite o primeiro cateto:");
        c1 = leia.nextDouble();

        System.out.println("Digite o segundo cateto:");
        c2 = leia.nextDouble();

        TrianguloRetangulo triangulo = new TrianguloRetangulo(c1, c2);

        double hipotenusa = triangulo.CalculaHipotenusa();

        double area = triangulo.CalculaArea();

        System.out.println("Hipotenusa: " + hipotenusa);

        System.out.println("Area do triangulo: " + area);

        leia.close();
    }
}