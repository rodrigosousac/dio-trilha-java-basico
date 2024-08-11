package conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main (String[] args) {
		
		int conta;
		String agencia;
		String cliente;
		double saldo;
		String mensagem;
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Conta: ");
		conta = teclado.nextInt();
		
		System.out.println("Agência: ");
		agencia = teclado.next();
		
		System.out.println("Nome do cliente: ");
		cliente = teclado.next();
		
		System.out.println("Saldo: ");
		saldo = teclado.nextDouble();
		
		mensagem = "Olá "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.";
		
		System.out.println(mensagem);
		teclado.close();
		
	}
}