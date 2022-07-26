package exercicios0302;

import java.util.ArrayList;

public class Elevador extends Pessoas {

	private int andarAtual;
	private int capacidade;
	private ArrayList<Pessoas> pessoas;
	private final static double pesoMax = 110.0;

	public Elevador(int andarAtual, int capacidade, double pesoMax, double peso, String nome) {
		super(peso, nome);
		this.andarAtual = andarAtual;
		this.capacidade = capacidade;
		// this.pessoas = pessoas;
	}

	public ArrayList<Pessoas> getPessoas() {
		if (pesoTotal() <= pesoMax) {
			System.out.print("Peso maximo atingido");
		}
		return pessoas;
	}

	public void setPessoa(ArrayList<Pessoas> pessoas) {
		this.pessoas = pessoas;
	}

	private double pesoTotal() {
		double pesoTotal = 0.0;

//		for (Pessoas p : getPeso()) {
//			pesoTotal += p.getPeso();
//
//		}

		return pesoTotal;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "\nAndar atual: " + andarAtual + "\nCapacidade: " + capacidade + "\nPessoas: " + pessoas
				+ "\nPeso maximo: " + pesoMax;
	}

}
