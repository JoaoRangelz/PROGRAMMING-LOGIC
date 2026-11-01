import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite sua idade: ");
        int idade = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (idade < 16){
            System.out.print("Situação: NÃO PODE VOTAR");
        } else if (idade == 16 || idade == 17){
            System.out.print("Situação: VOTO OPCIONAL");
        } else if (idade >= 18 && idade <= 69){
            System.out.print("Situação: VOTO OBRIGATÓRIO");
        } else {
            System.out.print("Situação: VOTO OPCIONAL");
        }

        resposta.close();
    }
}


