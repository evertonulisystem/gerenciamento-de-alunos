package br.gotasdetecnologia.eum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.gotasdetecnologia.eum.entity.Aluno;
import br.gotasdetecnologia.eum.repository.AlunoRepository;

@SpringBootApplication
public class GerenciamentoDeAlunosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDeAlunosApplication.class, args);
	}

	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		/*
		 * Aluno aluno1 = new Aluno("Everton", "Ulisses", "everton@gmail.com");
		 * alunoRepository.save(aluno1);
		 * 
		 * Aluno aluno2 = new Aluno("Ulisses", "Mendonca", "ulissees@gmail.com");
		 * alunoRepository.save(aluno2);
		 * 
		 * Aluno aluno3 = new Aluno("Everton", "Ulisses", "everton@gmail.com");
		 * alunoRepository.save(aluno3);
		 * 
		 * Aluno aluno4 = new Aluno("Ulisses", "Mendonca", "ulissees@gmail.com");
		 * alunoRepository.save(aluno4);
		 */
		 
		 
		
		
		
		
	}

	
	
	
}
