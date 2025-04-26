public class Main {

	public static void main(String[] args) {
		String cpfTeste;
		Pessoa teste = new Pessoa();
		teste.setCPF(Teclado.lerString("Entre com CPF"));
		cpfTeste = teste.getCPF();
		System.out.println(cpfTeste);
	}

}
