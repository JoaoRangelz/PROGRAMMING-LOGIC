import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite o primero valor: ");
        int num1 = resposta.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = resposta.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int num3 = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        System.out.println("Valores: " + num1 + ", " + num2 + ", " + num3);


        if (num1 <= num2 && num2 <= num3) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num1, num2, num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num1, num3, num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num2, num1, num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num2, num3, num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num3, num1, num2);
        } else if (num3 <= num2 && num2 <= num1) {
            System.out.printf("Ordem Crescente: %d, %d, %d.", num3, num2, num1);
        }

        resposta.close();
    }
}

