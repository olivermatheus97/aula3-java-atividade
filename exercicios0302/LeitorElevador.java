package exercicios0302;

import java.util.List;
import java.util.Scanner;

public class LeitorElevador {

	public static void main(String[] args) {
		int opcao = -1;

		// sler é obj da classe scanner
		Scanner sLer = new Scanner(System.in);

		// instancia de elevador, ou seja, um objeto da classe elevador
		Elevador elevador = new Elevador(1, 10);

		while (true) {
			menuEl();
			opcao = sLer.nextInt();

			if (opcao == 0)
				break;

			switch (opcao) {
			case 1:
				elevador.sobe();
				break;
			case 2:
				elevador.desce();
				break;
			case 3:
				System.out.println("digite peso da pessoa: ");
				Double peso = sLer.nextDouble();
				Pessoas pessoa = new Pessoas(peso);
				elevador.entraPessoa(pessoa);
				break;
			case 4:
				List<Pessoas> pessoas = elevador.getListaPessoas();
				System.out.println("Escolha a pessoa que vai sair: ");
				for (Pessoas pessoas2 : pessoas) {
					System.out.println("Peso: " + pessoas2.getPeso());
				}
				Double peso1 = sLer.nextDouble();
				elevador.saiPessoa(peso1);
				break;
			case 5:
				System.out.println(elevador.toString());
				break;

			}

		}
	}

	private static void menuEl() {
		System.out.printf("\n\n > Menu ");
		System.out.printf("\n  1- Sobe de Andar ");
		System.out.printf("\n  2- Desce de Andar ");
		System.out.printf("\n  3- Entra Pessoa ");
		System.out.printf("\n  4- Sai Pessoa ");
		System.out.printf("\n  5- Mostrar informações ");
		System.out.printf("\n  0- Sair ");
		System.out.printf("\n > Resposta: ");

	}

}
