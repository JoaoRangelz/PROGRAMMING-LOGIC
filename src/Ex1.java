import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        // Entrada do usuário//
        System.out.print("Primeiro valor: ");
        int num1 = resposta.nextInt();

        System.out.print("Segundo valor: ");
        int num2 = resposta.nextInt();

        //Lógica e Cálculo//
        int soma = num1 + num2;

        //Sáida//
        System.out.println("Soma: " + soma);

        resposta.close();
    }
}
