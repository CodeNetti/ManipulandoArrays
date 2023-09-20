package application;

import java.util.Locale;
import java.util.Scanner;

import models.Model_Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String name;
		double n1;
		double n2;
		boolean nobody = false;
		
		System.out.println("Vamos calcular a media dos alunos, digite a quantidade de alunos");
		System.out.println("Lembrando que a media de notas é 6");
		int n = sc.nextInt();
		 Model_Pessoa[] v = new Model_Pessoa[n];
		double sum = 0;
		for(int i=0; i<n; i++) 
		{
			System.out.println("Digite o nome do " + (i+1) + " aluno(a) e sua respectiva nota do primeiro e segundo semestre");
			sc.nextLine();
			name = sc.nextLine();
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			v[i] = new Model_Pessoa(name, n1, n2);
		}
		System.out.println("Alunos aprovados:");
		for(int i=0; i<n; i++) 
		{
			
			if(v[i].getN1() + v[i].getN2() / 2 > 6.0) 
			{
				System.out.println(v[i].getName());
				nobody = true;
			}
			
			
		}
		if(nobody == false) 
		{
			System.out.println("Todos os alunos ficaram abaixo da media");
		}
		
		
		
		

	}

}
