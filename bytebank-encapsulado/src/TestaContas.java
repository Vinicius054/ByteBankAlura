
public class TestaContas {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1374, 23334);
		
		System.out.println(conta.getAgencia());
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
	}
}
