package aplicacao;

/*
 * Fazerumprogramaparalerumn�merointeiroNedepoisosdados(id,nomeesalario)
 * de Nfuncion�rios.N�odevehaverrepeti��odeid.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio. 
 * Paraisso,o programa deve ler um id eo valor X.
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

public class Programa 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionarios para o Cadastro: ");
		
		int qDeCadastro = sc.nextInt();
		
		List<String> listF = new ArrayList<>();
		
		for(int i =0; i< qDeCadastro; i++) 
		{

		}

		sc.close();	
	}

}