package br.gotasdetecnologia.eum.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="alunos")
public class Aluno {
	
	@Id
	// ParaMYSQL @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_usuario")
	
	private Long id;
	
	@Column(name="nome", nullable = false )
	private String nome;
	
	@Column(name="sobrenome")
	private String sobrenome;
	
	@Column(name="email")
	private String email;
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String sobrenome, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
