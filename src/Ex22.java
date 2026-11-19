import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Locale Brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Brasil);

        //Entrada do usuário//
        System.out.print("Digite seu salário: ");
        double salario = resposta.nextDouble();

        //Lógica e Cálculo//
        String percentual;
        double aumento;
        double novoSalario;

        if (salario <= 1500.00){
            aumento = salario * 0.15;
            percentual = "15%";
            novoSalario = salario + aumento;
        } else if(salario >= 1500.01 && salario <= 3000.00){
            aumento = salario * 0.10;
            percentual = "10%";
            novoSalario = salario + aumento;
        } else {
            aumento = salario * 0.05;
            percentual = "5%";
            novoSalario = salario + aumento;
        }

        //Saída//
        System.out.println("Seu Salário Atual: " + formatador.format(salario));
        System.out.println("Adição de: " + percentual);
        System.out.println("Aumento de: " + formatador.format(aumento));
        System.out.println("Seu Novo Salário: " + formatador.format(novoSalario));

        resposta.close();
    }
}
