package exercicios0301;

import java.time.*;

public class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;
	private Double altura;

	public Pessoa(String nome, LocalDate dataDeNascimento, double altura) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(this.dataDeNascimento, dataAtual);
		return periodo.getYears();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de Nascimento: " + dataDeNascimento + "\nAltura: " + altura + "\nIdade: "
				+ getIdade();
	}

}
