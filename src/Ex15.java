import java.util.Scanner;

public class Ex15 {
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

        //maior//
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Maior: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Maior: " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Menor: " + num2);
        } else if (num3 <= num2 && num3 <= num1) {
            System.out.println("Menor: " + num3);
        }
        resposta.close();
    }
}
