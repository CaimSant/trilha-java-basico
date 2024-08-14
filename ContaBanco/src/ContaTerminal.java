import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Ola, para a criar sua conta iremos precisar de algumas informações");

        System.out.println("Por favor, digite o número da Conta !");
        int numero = S.nextInt();
        S.nextLine();
        System.out.println("Por favor, digite o número da Agência !");

        String agencia = S.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");

        String nomeCliente = S.nextLine();

        System.out.println("Por favor, digite o valor inicial a ser depositado !");
        double saldo = S.nextDouble();

        System.out.printf("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é \""+agencia+"\", conta \""+numero+"\" e seu saldo de \'$%.2f\' já está disponível para saque.",saldo);
    S.close();
    }
}
