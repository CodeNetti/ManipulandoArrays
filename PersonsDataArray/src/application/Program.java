package application;

import java.util.Locale;
import java.util.Scanner;

import models.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite o tamanho do grupo de pessoas?");
		int n = sc.nextInt();

		System.out.println("Digite os dados dessas pessoas, são eles Nome, Idade e Altura");
		Person[] v = new Person[n];
		// Laço para Inserir os dados nas istancias.
		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.println("Digite um Nome");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite a Idade");
			int age = sc.nextInt();
			System.out.println("Digite a Altura");
			double heigth = sc.nextDouble();

			v[i] = new Person(name, age, heigth);
		}
		// Calculando a altura média pelo metodo Get
		double sum = 0;
		for (int i = 0; i < n; i++) {

			sum += v[i].getHeigth();
		}
		System.out.println("Altura média = " + sum / v.length);

		// Calculando as pessoas menores de 16 anos 
		double contador = 0.0;
		for (int i = 0; i < n; i++) {

			if (v[i].getAge() < 16) {
				contador++;
				System.out.println("Menor de 16 anos " + v[i].getName());

			}

		}
		// Calculando a porcentagem de pessoas menores de 16 anos
		double percentage = 0;
		percentage = contador / v.length;
		percentage = percentage * 100;
		System.out.println("Percentual de pessoas com menos de 16 anos: %"+ percentage);

		
	}

}
