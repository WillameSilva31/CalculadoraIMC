public class CalculadoraIndice {
    public static double imc(double peso, double altura){
        return peso/(altura*altura);
    }

    public static String registro( double imc) {
        if (imc <= 18.5) return "abaixo do peso";
        else if (imc >= 18.6 && imc <= 24.9) return "peso ideal(Parabens)";
        else if (imc >= 25 && imc <= 29.9) return "levemente acima do peso";
        else if (imc >= 30 && imc <=34.9) return "obesidade grau I";
        else if (imc >= 35 && imc <=39.9) return "obesidade grau II";
        else if (imc >= 40) return "obesidade grau III";
        else return "error";
    }
}
