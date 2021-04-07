package com.kleyton;

public class Aluno {
	
	private String nome;
	private int idade;
	private String matricula;
	
	public Aluno(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
