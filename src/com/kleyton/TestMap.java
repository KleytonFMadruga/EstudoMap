package com.kleyton;

public class TestMap {
	
	
	public static void main (String[] args) {
	
		CadastroAluno c1 = new CadastroAluno();
		
		
		
		Aluno a1 = new Aluno("José", 17, "1234567801");	
		String p = c1.cadastraAluno(a1);
		
		
		System.out.println(p);
		
		
		
		Aluno a2 = new Aluno("Josi", 18, "1234567890");
		String p2 = c1.cadastraAluno(a2);
		
		
		System.out.println(p2);
		
		
		
		
		
		
		
		
		System.out.println(c1.getAluno("1234567890"));
		
		
		
		
		
		
	}

}
