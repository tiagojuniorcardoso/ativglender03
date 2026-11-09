public class Equacao {

    double a;
    double b;
    double c;
    double x1;
    double x2;
    double delta;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculaDelta() {
        delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    public double calculaX1() {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        return x1;
    }

    public double calculaX2() {
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return x2;
    }
}