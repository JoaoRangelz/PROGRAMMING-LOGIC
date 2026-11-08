import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Locale Brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Brasil);

        //Entrada do Usuário//
        System.out.print("Digite o preço: ");
        double precoOriginal = resposta.nextDouble();

        System.out.println("________________________________________\n1 - Dinheiro ou Pix\n2 - Débito\n3 - Crédito à vista\n4 - Crédito parcelado");
        System.out.print("\nEscolha uma opção: ");
        int opcao = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        double valorFinal;

        if (opcao == 1) {
            valorFinal = precoOriginal - (precoOriginal * 10) / 100;
            System.out.println("Valor final: " + formatador.format(valorFinal));
        } else if (opcao == 2) {
            valorFinal = precoOriginal - (precoOriginal * 5) / 100;
            System.out.println("Valor final: " + formatador.format(valorFinal));
        } else if (opcao == 3) {
            valorFinal = precoOriginal;
            System.out.println("Valor final: " + formatador.format(valorFinal));
        } else if (opcao == 4) {
            valorFinal = precoOriginal + (precoOriginal * 8) / 100;
            System.out.println("Valor final: " + formatador.format(valorFinal));
        } else {
            System.out.println("Opção Inválida!");
        }

        resposta.close();
    }
}