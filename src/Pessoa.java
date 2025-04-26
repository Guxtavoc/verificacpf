public class Pessoa {
	private String CPF;
	
	public void setCPF(String cpf) {
		int[] cpfConvertidoPessoa=Pessoa.converte(cpf);
		System.out.println(Pessoa.verifica(cpfConvertidoPessoa));
		this.CPF=cpf;
	}
	public String getCPF() {
		return this.CPF;
	}
	public static int[] converte(String original) {
		if(original.length()!=11) {
			System.out.println("Tamanho Invalido");
			return null;
		}
		int[] cpf = new int[11];
		for (int i = 0; i < cpf.length; i++) {
			char c = original.charAt(i);
			if(Character.isDigit(c)) {
				cpf[i] = c - '0';
			}else {
				System.out.println("Caracter invalido detectado!");
				cpf=null;
				break;
			}
		}
		return cpf;
	}
	public static boolean verifica(int cpf[]) {//FALTA FAZER A VERIFICAÇÃO DO SEGUNDO DIGITO
		//https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
		int acumulado = 0;
		for (int i = 0; i < 9; i++) {
			acumulado+=cpf[i]*(10-i);
		}
		int resto = (acumulado*10)%11;
		return (resto == cpf[9]) ? true : false;

	}
}
