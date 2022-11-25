public class Conta {
	private double saldo = 0;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static  int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de Contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estou criando uma conta " + this.numero);
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero<= 0 ) {
			System.out.println("n�o pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
