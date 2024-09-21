import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("qual seu peso em kg?");
        double p = s.nextDouble();

        System.out.println("qual sua altura em metros? ");
        double a = s.nextDouble();

        double imc = CalculadoraIndice.imc(p, a);
        System.out.println("seu imc é:" +imc);
        System.out.println(CalculadoraIndice.registro(imc));;
    }
}