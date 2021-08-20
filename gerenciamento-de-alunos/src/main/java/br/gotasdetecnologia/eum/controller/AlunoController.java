package br.gotasdetecnologia.eum.controller;

import java.util.HashMap;
import java.util.Map;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;

import br.gotasdetecnologia.eum.entity.Aluno;
//import br.gotasdetecnologia.eum.repository.AlunoRepository;
//import br.gotasdetecnologia.eum.repository.AlunoRepository;
import br.gotasdetecnologia.eum.service.AlunoService;

@Controller
public class AlunoController {
	
	private AlunoService alunoService;
	
	
	public AlunoController(AlunoService alunoService) {
		super();
		this.alunoService=alunoService;
		
	}
	
	
	/*
	 * @GetMapping("/alunos")
	 * 
	 * @ResponseBody public ResponseEntity<List<Aluno>> listAlunos(){ List<Aluno>
	 * alunos = alunoService.getAllAlunos(); return new
	 * ResponseEntity<List<Aluno>>(alunos, HttpStatus.OK); }
	 */
	
	
	
	  @GetMapping("/alunos") public String listAlunos(Model model) {
	  model.addAttribute("alunos", alunoService.getAllAlunos()); return "alunos"; }
	 
	
	
	
	
	
	
	@GetMapping("/alunos/cadastro")
	public String cadastrarNovoAlunoPeloFormulario(Model model) {
		Aluno aluno = new Aluno();
		model.addAttribute("aluno", aluno);
		return "cadastro-alunos.html";
	}
	
	
	
	  @PostMapping("/alunos") public String salvarAluno(@ModelAttribute("aluno")
	  Aluno aluno) { //vai para serviceAluno e impl depois voltar
	  alunoService.salvarAluno(aluno); 
	  return "redirect:/alunos"; }
	 

	/*
	 * @PostMapping("/alunos")
	 * 
	 * @ResponseBody public ResponseEntity<Aluno> salvarAluno (@RequestBody Aluno
	 * aluno){ alunoService.salvarAluno(aluno); return new
	 * ResponseEntity<Aluno>(aluno, HttpStatus.CREATED); }
	 */
		
	  
	  
	  
	
	}
	
	
	





