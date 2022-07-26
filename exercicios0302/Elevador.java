package exercicios0302;

import java.util.ArrayList;

import exercicios0301.Pessoa;

//import exercicios0301.Pessoa;

public class Elevador {
	// propriedade de classe, sempre privadas
	private final static double pesoMax = 200.0;
	private int andarAtual;
	private int andaresPredio;
	private double pesoPessoas;
	private ArrayList<Pessoas> listaPessoas = new ArrayList<Pessoas>();
	// private double pesoPessoa;

	// construtor
	public Elevador(int andarAtual, int andaresPredio) {
		this.andarAtual = andarAtual;
		this.andaresPredio = andaresPredio;
		this.pesoPessoas = 0;
	}

	public void sobe() {
		if (this.andarAtual < this.andaresPredio)
			this.andarAtual += 1;
	}

	public void desce() {
		if (this.andarAtual > 0)
			this.andarAtual -= 1;
	}

	public void entraPessoa(Pessoas pessoa) {
		if (pesoPessoas + pessoa.getPeso() <= pesoMax) {
			this.listaPessoas.add(pessoa);
			this.pesoPessoas += pessoa.getPeso();
			System.out.println("Pessoa adicionada com sucesso");
		} else {
			System.out.println("Peso excede capacidade elevador");
		}
	}

	public ArrayList<Pessoas> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(ArrayList<Pessoas> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	public void saiPessoa(Double peso) {
		for (Pessoas pessoa : listaPessoas) {
			if (peso == pessoa.getPeso()) {
				listaPessoas.remove(pessoa);
				System.out.println("Pessoa removida com sucesso");
				return;
			}
		}
		System.out.println("Não foi possivel remover pessoas");
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndaresPredio() {
		return andaresPredio;
	}

	public void setAndaresPredio(int andaresPredio) {
		this.andaresPredio = andaresPredio;
	}

	@Override
	public String toString() {
		return "\nAndar atual: " + andarAtual + "\nPeso maximo: " + pesoMax + "\nQuantidade de pessoas: "
				+ this.listaPessoas.size();
	}

}
