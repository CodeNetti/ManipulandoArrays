package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite o tamanho do vetor");
		int n = sc.nextInt();
		System.out.println("Digite " + n + " números do Vetor");
		double [] v = new double[n];
		double sum = 0;
		for(int i=0; i<n; i++) 
		{
			v[i] = sc.nextDouble();
			sum += v[i];
		}
		
		
		double average = sum;
		average = average / n;
		System.out.println("Media dos valores do Array = " + average);
		System.out.println("Valores abaixo da média");
		
		boolean error  = false;
		
		for(int i=0; i<n; i++) 
		{
			if(v[i] < average) 
			{
				System.out.println(v[i]);
				error = true;
			}
			
		}
		if(error == false) 
		{
			System.out.println("Não existem valores abaixo da média");
		}
		
		
		

	}

}
