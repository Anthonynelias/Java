
public class TestaCondicional2 {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadedePessoas = 3;
		boolean acompanhado = quantidadedePessoas >= 2;
		if (idade >= 18 && acompanhado == true) { // || = ou, && = e, == igual
			System.out.println("Você pode entrar!");
		} else {
			System.out.println("Você não pode entrar");
		}
		switch (idade) {
		case 8:
			System.out.println("Criança");
			break;
		case 9:
			System.out.println("Adulto");
			break;
		case 10:
			System.out.println("Velho");
			break;
		default:
			System.out.println("Erro");
		}

	}
}
