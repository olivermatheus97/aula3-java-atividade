package exercicios0301;

import java.time.LocalDate;

public class LeitorPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(1997, 11, 10), 1.75);
		System.out.println(pessoa.toString());

	}

}
