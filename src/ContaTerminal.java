import java.util.Scanner;

public class ContaTerminal {
    private static String mensagem = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.";

    public static void main(String[] args) throws Exception {        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = in.next();

        System.out.print("Digite a agência: ");
        String agencia = in.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = in.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = in.nextDouble();

        in.close();

        System.out.println(String.format(mensagem, nomeCliente, agencia, numeroConta, saldo));
    }
}
