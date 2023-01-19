
import java.util.Locale;
import java.util.Scanner;
import com.nataniel.aula.Calcular;
import com.nataniel.aula.Saudar;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        String operacao = "";
        Saudar.Saudacao();
        System.out.println("Digite a operação desejada:\nsomar ( + )\nsubtrair ( - )\nmultiplicar ( * )\ndividir ( / )");

        do{
            operacao = entrada.next();
        }        
        while(!Calcular.ValidarOperacao(operacao));

        System.out.print("Digite o operador 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o operador 2: ");
        double n2 = entrada.nextDouble();
        entrada.close();
        Calcular.ExecutarCalculo(operacao, n1, n2);

    }
}
