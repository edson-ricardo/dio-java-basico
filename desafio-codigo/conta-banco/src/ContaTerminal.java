import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //int numeroConta = 1021;
        //String agencia = "067-8";        
        Double saldo = 237.48;
        
        System.out.print("Digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();        

        System.out.print("Digite o Número da sua Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.print("Digite o Número da sua Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();        

        //TODO: Exibir a mensagem conta criada
        System.out.println("-----------------------------------------------------");
        System.out.println("Olá, " + nomeCliente + ".\nObrigado por criar uma conta em nosso banco. \nSua Agência é: "
        + agencia + ". \nSua Conta é: " + numeroConta + ".\nO seu saldo de " + saldo + " já está disponível para saque.");
        System.out.println("-----------------------------------------------------");
    }
}
