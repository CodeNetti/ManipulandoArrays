package application;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Vamos fazer uma soma entre 2 Vetores");
		System.out.println("Digite o tamanho que os vetores vão ter");
		int n = sc.nextInt();
		System.out.println("Digite " + n + " números do vetor A");
		int[] a = new int[n];
		for(int i=0; i<n; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Digite " + n + " números do vetor B");
		int[] b = new int[n];
		for(int i=0; i<n; i++) 
		{
			b[i] = sc.nextInt();
		}
		int[] resultado = new int[n];
		System.out.println("Soma dos vetores A e B:");
		for(int i = 0; i<n; i++) 
		{
			resultado[i] = a[i] + b[i];
			System.out.println(resultado[i]);	
		}
		

	}

}
