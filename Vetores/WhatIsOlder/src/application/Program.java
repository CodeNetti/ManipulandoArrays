package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Vamos verificar qual das pessoas que você digitar são mais velhas");
		System.out.println("Quantas pessoas você vai digitar?");
		int n = sc.nextInt();
		String name[] = new String[n];
		int age[] = new int[n];
		int old = 0;
		String oldman = null;
		System.out.println("Digite os dados de " + n + " pessoas (Nome e depois Idade");	
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			sc.nextLine();
			name[i] = sc.nextLine();
			age[i] = sc.nextInt();
			if(age[i] > old) 
			{
				old = age[i];
				oldman = name[i];
			}
			System.out.println("Pessoa mais velha: " + oldman);
		}
	

	}

}
