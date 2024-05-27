import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DadosConta dados = new DadosConta();

        System.out.println("Por favor, digite o seu nome");
        dados.setNomeCliente(scan.next());
        System.out.println("Por favor, digite o número da conta");
        dados.setNumeroConta(scan.nextInt());
        System.out.println("Por favor, digite o número da agência");
        dados.setAgencia(scan.next());
        System.out.println("Por favor, digite o seu saldo");
        dados.setSaldo(scan.nextLong());

        
        System.out.println("Ola " + dados.getNomeCliente() + " , obrigado por criar uma conta em nosso banco, sua agência e " + dados.getAgencia() +
         ", conta " + dados.getNumeroConta() + "  e seu saldo "+ dados.getSaldo() +" ja esta disponivel para saque");
    }
}
