import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{
      //TODO:Conhecer e importar a classe Scanner
		
	  //Exibir as mensagens para o nosso usuário
		
	  //Obter pela scanner os valores digitados no terminal
		
	  //Exibir a mensagem conta criada	
		
	 Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	 
	 int numero;
	 String agencia;
	 String nomeCliente;
	 double saldo;
     
     System.out.println("Por favor, digite o numero da sua conta! ");
     numero = sc.nextInt();
     sc.nextLine();
     System.out.println("Por favor, digite o número da Agência! ");
     agencia = sc.nextLine();

     System.out.println("Por favor, digite o seu nome! ");
     nomeCliente = sc.nextLine();
     
     System.out.println("Por favor, digite o seu saldo! ");
     saldo = sc.nextDouble();
     
     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque." );
     
     
     
     
     
	}
}
