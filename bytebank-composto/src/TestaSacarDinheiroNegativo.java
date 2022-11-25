
public class TestaSacarDinheiroNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101)); 
		
		conta.saca(101);
		//proibido, pois está acessando por meios de atributos, sendo que o correto seria acessar por metodos.
		//conta.saldo = conta.saldo - 101;
		
		System.out.println(conta.getSaldo());
	}
}
