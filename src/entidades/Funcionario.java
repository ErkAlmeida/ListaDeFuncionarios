package entidades;

public class Funcionario 
{
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {}

	public Funcionario(Integer id, String nome, Double salario) 
	{
		this.id = id;
		this.nome = nome;
		this.salario = salario;
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

	public Double getSalario() {
		return salario;
	}

	/*
	  N�o tera altera��o salarial direta
	 	
	 	public void setSalario(Double salario) 
		{
		this.salario = salario;
		}
	*/

	public double AlteraSalario(Double salario)
	{
		return 0;
	}
	
	
}
