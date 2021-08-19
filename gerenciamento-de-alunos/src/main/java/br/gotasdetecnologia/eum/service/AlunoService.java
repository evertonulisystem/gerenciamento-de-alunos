package br.gotasdetecnologia.eum.service;

import java.util.List;

import br.gotasdetecnologia.eum.entity.Aluno;

public interface AlunoService { 
	
	List<Aluno> getAllAlunos();
	
	Aluno salvarAluno(Aluno aluno);
	
	
	
}
