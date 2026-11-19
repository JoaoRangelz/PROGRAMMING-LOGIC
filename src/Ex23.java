import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite seu Peso em kg: ");
        double peso = resposta.nextDouble();

        System.out.print("Digite sua Altura em metros: ");
        double altura = resposta.nextDouble();

        //Lógica e Cálculo//
        double imc = peso / (altura * altura);
        String classify;

        if (imc < 18.5) {
            classify = "ABAIXO DA FAIXA";
        } else if (imc >= 18.5 && imc < 25.0) {
            classify = "FAIXA NORMAL";
        } else if (imc >= 25.0 && imc < 30.0) {
            classify = "ACIMA DA FAIXA";
        } else {
            classify = "FAIXA ELEVADA";
        }

        //Saída//
        System.out.println("\n===================");
        System.out.println("Peso: " + peso + "kg");
        System.out.print("Altura: " + altura + " metros");
        System.out.printf("\nIMC: %.1f", imc);
        System.out.println("\nClassificação: " + classify);
        System.out.println("===================");

        resposta.close();
    }
}
