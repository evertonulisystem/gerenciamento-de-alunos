package br.gotasdetecnologia.eum.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gotasdetecnologia.eum.entity.Aluno;
import br.gotasdetecnologia.eum.repository.AlunoRepository;
import br.gotasdetecnologia.eum.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	private AlunoRepository alunoRepository;
	
	public AlunoServiceImpl(AlunoRepository alunoRepository) {
		super();
		this.alunoRepository = alunoRepository;
		
	}

	@Override	
	public List<Aluno> getAllAlunos(){
			return alunoRepository.findAll();
		}

	
	public Aluno salvarAluno(Aluno aluno) {
		
		return alunoRepository.save(aluno);
		
	}
	
	
}
