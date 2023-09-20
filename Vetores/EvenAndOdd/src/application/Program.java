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
		int [] v = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++) 
		{
			v[i] = sc.nextInt();
			sum += v[i];
		}
		boolean evenornot = false;
		boolean oddornot = false;
		System.out.println("Esses são os numeros Pares do Vetor");
		for(int i=0; i<n; i++) 
		{
			if(v[i] % 2 == 0) 
			{
				System.out.println(v[i]);
				evenornot = true;
			}
			
		}
		System.out.println("Esses são os numeros Impares do Vetor");
		for(int i=0; i<n; i++) 
		{
			if(v[i] % 2 > 0) 
			{
				System.out.println(v[i]);
				oddornot = true;
			}
			
		}
	
	    int average = sum;
		average = average / n;
		System.out.println("Media dos valores do Vetor = " + average);
		
		if(evenornot = false) 
		{
			System.out.println("Não existem números Pares no Vetor");
		}
		if(oddornot = false) 
		{
			System.out.println("Não existem números Impares no Vetor");
		}

	}

}
