package aplicacao;

/*
 * FazerumprogramaparalerumnúmerointeiroNedepoisosdados(id,nomeesalario)
 * de Nfuncionários.Nãodevehaverrepetiçãodeid.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. 
 * Paraisso,o programa deve ler um id eo valor X.
 * Se o id informado não existir, mostrar uma mensagem e abortar a operação. 
 * Ao final, mostrar a listagem atualizada dos funcionários, conformeexemplos.
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário 
 * possa ser mudado livremente. Um salário só pode ser aumentado combase em uma operação de aumento por porcentagem dada
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