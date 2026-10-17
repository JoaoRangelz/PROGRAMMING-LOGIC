import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite um número: ");
        int num = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (num > 0){
            System.out.println("Resultado: POSITIVO");
        } else if (num == 0){
            System.out.println("Resultado: ZERO");
        } else {
            System.out.println("Resultado: NEGATIVO");
        }

        resposta.close();
    }
}
