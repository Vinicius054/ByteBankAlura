
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 242226);
		/* conta est? inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-330);
		*/
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println(Conta.getTotal()); 
	}
}
