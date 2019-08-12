package pacote1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Classe3 {// Aprendendo metodos

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat();
		menu();

	}

	public static void menu() {
		Cliente pessoa1 = new Cliente();
		Cliente pessoa2 = new Cliente();

		System.out.println(pessoa1.getIdade());
		System.out.println("*****MENU*****");
		System.out.println("1-Cadastrar Cliente\n2-");

	}

}

class Cliente {

	private static int idade;
	private String nome;

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cliente() {
		Cliente.idade++;

	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
