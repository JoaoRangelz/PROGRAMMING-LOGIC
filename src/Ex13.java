import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite um número: ");
        int num = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        resposta.close();
    }
}
