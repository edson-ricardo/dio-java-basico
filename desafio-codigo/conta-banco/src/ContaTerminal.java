import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //int numeroConta = 1021;
        //String agencia = "067-8";        
        Double saldo = 237.48;
        
        System.out.println("Digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();        

        System.out.println("Digite o Número da sua Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Digite o Número da sua Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();        

        //TODO: Exibir a mensagem conta criada
        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
        





    }
}
