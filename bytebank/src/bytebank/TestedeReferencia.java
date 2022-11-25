package bytebank;

public class TestedeReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		/*
		 * A segunda conta ela e uma referencia da primeira conta, pois ela est�
		 * apontado para o mesmo endere�o de memoria da primeira conta, ent�o todos os
		 * dados que tanto ela quanto a primeira conta receber eles ser�o modificados,
		 * mais eu so tenho uma conta, mais as duas variaveis se referenci�o para o
		 * mesmo objeto Conta, e so tem uma conta porque foi instaciado somente um NEW
		 * conta.
		 */
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);

		segundaConta.saldo = +100;
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);

		System.out.println(primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("S�o iguais!");
		}

	}
}
