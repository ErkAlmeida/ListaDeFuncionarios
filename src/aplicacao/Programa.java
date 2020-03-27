package aplicacao;

/*
 * Fazer um programa para ler um n�mero inteiro N e depois os dados(id,nome e salario)
 * de N funcion�rios. 
 * N�o deve haver repeti��o de id.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio. 
 * Para isso,o programa deve ler um id eo valor X.
 * Se o id informado n�o existir, mostrar uma mensagem e abortar a opera��o. 
 * Ao final, mostrar a listagem atualizada dos funcion�rios, conformeexemplos.
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio 
 * possa ser mudado livremente. Um sal�rio s� pode ser aumentado combase em uma opera��o de aumento por porcentagem dada
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionarios para o Cadastro: ");
		
		int qDeCadastro = sc.nextInt();
		
		//Instaciando a lista
		List<Funcionario> listF = new ArrayList<>();
		
		sc.nextLine();//Consumir  quebra da linha pendente
		
		for(int i =0; i< qDeCadastro; i++) 
		{
			//Cadastro dos dados na lista
			
			System.out.printf("ID:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Nome:");
			String nome = sc.nextLine();
			
			System.out.printf("Salario:");
			double salario = sc.nextDouble();
			
			//Incremento na lista
			
			listF.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("===========================================================");
		
		for(Funcionario lista : listF) 
		{
			System.out.println(lista);
		}
		
		System.out.println("===========================================================");
		
		System.out.println("Digite o ID do funcionario para aumentar o salario");
		
		Funcionario func;
		
		//Repetindo metodo de entrada do ID
		do 
		{
			System.out.print("ID: ");
		
			double idParaAumento = sc.nextDouble();
			
			//Filtrando a lista
			func = listF.stream().filter(x -> x.getId() == idParaAumento).findFirst().orElse(null);
			
			//Verificando se a Lista � null
			if(func == null)
			{
				System.out.println("ID n�o em contrado");
			}else {
						
				System.out.println();
		
				System.out.print("Porcentagem: ");
				double porcentagem = sc.nextDouble();
			
				func.AlteraSalario(porcentagem);
			}
			
		}while(func == null);
		
		System.out.println("===========================================================");
		
		// Imprimindo a lista
		
		for(Funcionario lista : listF) 
		{
			System.out.println(lista);
		}
		
		sc.close();	
	}
}