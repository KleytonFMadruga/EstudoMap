package com.kleyton;

import java.util.HashMap;
import java.util.Map;

public class CadastroAluno {
	
	private Map<String, Aluno> cadastro ;

	public CadastroAluno() {
		this.cadastro = new HashMap<String, Aluno>();
	}
	
	public String cadastraAluno(Aluno aluno) {
		cadastro.put(aluno.getMatricula(), aluno);
		return "Cadastrado com sucesso";
	}
	
	public Aluno getAluno(String matricula) {
		Aluno aluno = cadastro.get(matricula);
		return aluno;
	}
	
	

}
