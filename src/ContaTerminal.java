import java.util.Scanner;

public class ContaTerminal {

	
	public static void main(String[] args) {
		
		int numeroConta;
		int agencia ;
		
		String nomeCliente ;
		
        double saldo;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta : ");
        
        numeroConta = scanner.nextInt();
        
        System.out.println("Digite o numero da agência  : ");
        
        agencia = scanner.nextInt();
        
        
        System.out.println("Digite o nome do cliente   : ");
        
        nomeCliente = scanner.next();
        
        
        System.out.println("Seu saldo é    : ");
        
        saldo = scanner.nextDouble();
      
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia
         		+ " ,conta " + numeroConta+ " e seu saldo " + saldo +" já está disponível para saque.");
         
        
        
        
      	}
}