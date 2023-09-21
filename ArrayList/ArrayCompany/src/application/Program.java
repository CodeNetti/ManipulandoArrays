package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios existem na empresa?");
		int n = sc.nextInt();
		String name;
		int id;
		double salary;
		System.out.println("Olá sou o raphael do RH, me informe os nome e o salario de " + n + " funcionarios");
		
	}

}
