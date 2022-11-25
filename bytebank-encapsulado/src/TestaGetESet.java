public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337 -> Atributo Privado
		// conta.setNumero(1337); -> N preciso mais por causa do construtor que foi definido
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		// conta.titular = paulo -> Atributo privado não acessa
		// Maneira certa e acessar pelo metodo
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());// Estou andando dentro das classes que estão referenciando, eu
															// acesso primeiro o getTitular, dentro dela eu acesso o
															// getNome.

		// Agora o mesmo exemplo em duas linhas:
		// Exemplo em UMA Linhas:

		conta.getTitular().setProfissao("Programador");
		// Exemplo em Duas linhas:

		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
	}
}
