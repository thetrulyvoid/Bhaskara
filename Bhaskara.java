import java.util.Scanner;

public class Bhaskara {

    public static double calcularDelta(int a, int b, int c) {

        return (b*b)-4*a*c;

    }

    public static double calcularX1(int a, int b, int c, double delta) {

        return (-b+(Math.sqrt(delta)))/(2*a);

    }

    public static double calcularX2(int a, int b, int c, double delta) {

        return (-b-((Math.sqrt(delta))))/(2*a);

    }

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        System.out.println("");

        System.out.println("Insira a variável A:");

        int a = ler.nextInt();

        System.out.println("");

        System.out.println("Insira a variável B:");

        int b = ler.nextInt();

        System.out.println("");

        System.out.println("Insira a variável C:");

        int c = ler.nextInt();

        double delta = calcularDelta(a, b, c);

        double x1 = calcularX1(a, b, c, delta);

        double x2 = calcularX2(a, b, c, delta);

        System.out.println("");

        System.out.println("O seu x1 é "+x1+" e o seu x2 é "+x2);


    }

}