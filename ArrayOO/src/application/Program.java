package application;

import java.util.Locale;
import java.util.Scanner;

import models.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite a quantidade de produtos que deseja inserir");
		int n = sc.nextInt();
		Product[] v = new Product[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o Nome do produto em seguida aperte enter e didite o preço do produto");
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			v[i] = new Product(name, price);

		}
		
		double sum = 0;
		for(int i= 0 ; i < n; i++) 
		{
			
			sum = sum + v[i].getPrice();
		}
		 double median = sum / n; 
		
		 System.out.printf("A media dos preços dos produtos é: %.2f%n",median);
		

	}

}
