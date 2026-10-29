import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite a 1° nota: ");
        double nota1 = resposta.nextDouble();

        System.out.print("Digite a 2° nota: ");
        double nota2 = resposta.nextDouble();

        //Lógica, Cálculo e Saída//
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media >= 7){
            System.out.print("Situação: APROVADO");
        } else {
            System.out.print("Situação: REPROVADO");
        }

        resposta.close();
    }
}
