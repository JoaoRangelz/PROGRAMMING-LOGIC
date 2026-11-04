import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite um Ano: ");
        int ano = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
            System.out.print("ANO BISSEXTO");
        } else {
            System.out.print("NÃO BISSEXTO");
        }

        resposta.close();
    }
}
