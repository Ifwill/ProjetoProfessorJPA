package model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_professor")
	private String nome;
	@Column(name = "especialidade_professor")
	private String especialidade;
	@Column(name = "data_admissao")
	private String dataAdmissao;
	
	public Professor() {
	}

	public Professor(Integer id, String nome, String especialidade, String dataAdmissao) {
		this.id = null;
		this.nome = nome;
		this.especialidade = especialidade;
		this.dataAdmissao = dataAdmissao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataAdmissao, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(dataAdmissao, other.dataAdmissao) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", especialidade=" + especialidade + ", dataAdmissao="
				+ dataAdmissao + "]";
	}
	
}
