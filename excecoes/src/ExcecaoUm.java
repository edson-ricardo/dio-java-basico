import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExcecaoUm {
    public static void main(String[] args) {        
        /* Vejamos alguns possíveis erros:
        - Não informar o nome e sobrenome
        - O valor da idade ter um caracter NÃO númerico
        - O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano)
        */

        //Try: Vai ficar acompanhando tudo o que for positivo.
        //Catch: entrará em execução cao dê erro no "try".

        try{ 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);                
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("O campo 'idade' precisa ser numérico");
            System.out.println("O campo 'altura' precisa ser numérico e não tem 'vírgula', e sim 'ponto'.");
        }

    }
}
