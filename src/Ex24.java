import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //entrada do usuário//
        int med1;
        int med2;
        int med3;

        System.out.println("Digite 3 Medidas: ");

        while (true) {
            System.out.print("1° Medida: ");
            med1 = resposta.nextInt();
            if (med1 > 0) {
                break;
            } else {
                System.out.println("Resposta Inválida! Tente novamente.");
            }
        }

        while (true) {
            System.out.print("2° Medida: ");
            med2 = resposta.nextInt();
            if (med2 > 0) {
                break;
            } else {
                System.out.println("Resposta Inválida! Tente novamente.");
            }
        }

        while (true) {
            System.out.print("3° Medida: ");
            med3 = resposta.nextInt();
            if (med3 > 0) {
                break;
            } else {
                System.out.println("Resposta Inválida! Tente novamente.");
            }
        }

        //Lógica, Cálculo e Saída//
        if (med1 < med2 + med3 && med2 < med1 + med3 && med3 < med1 + med2){
            System.out.print("FORMAM UM TRIÂNGULO");
        } else {
            System.out.print("NÃO FORMAM UM TRIÂNGULO.");
        }

        resposta.close();
    }
}
