public class Pessoa {
	private String CPF;
	
	public void setCPF(String cpf) {
		if(Pessoa.verifica(cpf)==true) {
			System.out.println("CPF valido!");
			this.CPF=cpf;
		}else {
			System.out.println("CPF invalido");
		}
		
	}
	public String getCPF() {
		return this.CPF;
	}
	public static boolean verifica(String original) {
		if(original.length()!=11) {
			System.out.println("Tamanho Invalido");
			return false;
		}
		int[] cpf = new int[11];
		for (int i = 0; i < cpf.length; i++) {
			char c = original.charAt(i);
			if(Character.isDigit(c)) {
				cpf[i] = c - '0';
			}else {
				System.out.println("Caracter invalido detectado!");
				return false;
			}
		}
		int acumulado = 0;
		for (int i = 0; i < 9; i++) {
			acumulado+=cpf[i]*(10-i);
		}
		int resto1 = (acumulado*10)%11;
		acumulado=0;
		for (int i = 0; i < 10; i++) {
			acumulado+=cpf[i]*(11-i);
		}
		int resto2 = (acumulado*10)%11;
		resto1 = (resto1 == 10) ? 0 : resto1;
		resto2 = (resto2 == 10) ? 0 : resto2;
		return (resto1==cpf[9]&&resto2==cpf[10]);
	}
}
