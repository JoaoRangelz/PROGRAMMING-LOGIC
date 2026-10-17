import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite o primeiro valor: ");
        int num1 = resposta.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (num1 > num2){
            System.out.println("Maior valor: " + num1);
        } else if (num2 > num1){
            System.out.println("Maior valor: " + num2);
        } else {
            System.out.println("Não existe valor maior");
        }

        resposta.close();
    }
}
