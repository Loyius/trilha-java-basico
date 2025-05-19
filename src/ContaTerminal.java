
import java.util.Scanner;

public class ContaTerminal {
    public String agencia;
    public String nome;
    public int saldo;
    public int numero;
    
    //Todo: Obter pelo scanner os valores digitados no terminal
    public ContaTerminal(String agencia, String nome, int saldo, int numero){
            this.agencia = agencia;
            this.nome = nome;
            this.saldo = saldo;
            this.numero = numero;
    }

    //Todo: Exibir as mensagens para o nosso usuário
    public void exibirmensagem(){
        System.out.println("\nOlá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo de "+ saldo +" já está disponível para saque");
    }
    public static void main(String[] args) throws Exception {
        //Todo:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conta bancária\n");

        System.out.println("Por favor, digite o número da agência.");
        int numero = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("\nPor favor, informe o nome da sua agência.");
        String agencia = scanner.nextLine(); 

        System.out.println("\nPor favor, digite o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("\nPor favor, digite seu saldo atual.");
        int saldo = scanner.nextInt();
        
        scanner.close();

        ContaTerminal conta = new ContaTerminal(agencia, nome ,saldo, numero);

        //Todo: Exibir a mensagem conta criada
        conta.exibirmensagem();

    }
}
