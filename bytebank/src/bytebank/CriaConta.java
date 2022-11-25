package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 300;

		System.out.println("Primeira Conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda Conta tem: " + segundaConta.saldo);
		System.out.println("Terceira Conta tem: " + terceiraConta.saldo);
	}
}
