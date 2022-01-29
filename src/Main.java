
public class Main {

	public static void main(String[] args) {
		Cliente camila = new Cliente();
		camila.setNome("camila");
		Conta cc1 = new ContaCorrente(camila);
		Conta poupanca1 = new ContaPoupanca(camila);
		cc1.depositar(100);
		cc1.transferir(75, poupanca1);
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

		Cliente helton = new Cliente();
		helton.setNome("Helton");
		Conta cc2 = new ContaCorrente(helton);
		Conta poupanca2 = new ContaPoupanca(helton);
		cc2.depositar(10800);
		cc2.transferir(3450, poupanca2);
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
