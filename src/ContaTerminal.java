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
        
        System.out.println("Digite o numero da ag�ncia  : ");
        
        agencia = scanner.nextInt();
        
        
        System.out.println("Digite o nome do cliente   : ");
        
        nomeCliente = scanner.next();
        
        
        System.out.println("Seu saldo �    : ");
        
        saldo = scanner.nextDouble();
      
        System.out.println("Ol� " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua ag�ncia � "+agencia
         		+ " ,conta " + numeroConta+ " e seu saldo " + saldo +" j� est� dispon�vel para saque.");
         
        
        
        
      	}
}