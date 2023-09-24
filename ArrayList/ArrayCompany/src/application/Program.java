package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios existem na empresa?");
		int n = sc.nextInt();
		String name = null;
		int id = 0;

		double salary;
		System.out.println("Olá sou o raphael do RH, me informe o ID o  nome e o salario de " + n + " funcionarios");
		List<employe> listEmploye = new ArrayList<>();
		for (int i = 0; i < n; i++)

		{

			id = sc.nextInt();
			for (employe emp : listEmploye) {
				while (emp.getId() == id) {
					System.out.println("Esse id já existe, digite um Id diferente");
					id = sc.nextInt();
				}

			}

			sc.nextLine();
			name = sc.nextLine();
			salary = sc.nextDouble();
			listEmploye.add(new employe(id, name, salary));
		}

	}

}
