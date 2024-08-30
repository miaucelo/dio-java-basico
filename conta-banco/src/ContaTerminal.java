import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia;
        while (true) {
            System.out.println("Por favor, digite o número da Agência (4 dígitos):");
            agencia = scanner.nextLine();
            if (agencia.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Agência inválida. A agência deve ter exatamente 4 dígitos.");
            }
        }

        String numeroConta;
        while (true) {
            System.out.println("Por favor, digite o número da Conta (formato 999999-9):");
            numeroConta = scanner.nextLine();
            if (numeroConta.matches("\\d{6}-\\d{1}")) {
                break;
            } else {
                System.out.println("Conta inválida. A conta deve estar no formato 999999-9 e com (7 dígitos).");
            }
        }

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo de depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + 
                           " Após a confirmação de depósito estará disponível para saque.");


                           
        scanner.close();
    }   
}
