package entidades;

public class Funcionario 
{
	private Integer id;
	private String nome;
	private Double salario;
	
	//Construtores
	
	public Funcionario() {}

	public Funcionario(Integer id, String nome, Double salario) 
	{
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	//Gets e Sets
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
	  Não tera alteração salarial direta
	 	
	 	public void setSalario(Double salario) 
		{
		this.salario = salario;
		}
	*/
	
	//Metodo para atualização do salarial
	
	public double AlteraSalario(Double porcentagem)
	{
		return salario += salario*porcentagem/100;
	}
	
	//Metodo toString de retorno 
	
	public String toString() 
	{
		return "ID: "+this.id+" - Nome: "+this.nome+" - Salario: "+this.salario;
	}
}
