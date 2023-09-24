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
		int perc = 0;
		double salary;
		String read = null;
		System.out.println("Olá sou o raphael do RH, me informe o ID o  nome e o salario de " + n + " funcionarios");
		List<employe> listEmploye = new ArrayList<>();
		for (int i = 0; i < n; i++)

		{
			System.out.println("Colaborador " + (i + 1));
			System.out.print("ID: ");
			id = sc.nextInt();
			for (employe emp : listEmploye) {
				while (emp.getId() == id) {
					System.out.println("Esse id já existe, digite um Id diferente");
					System.out.print("ID: ");
					id = sc.nextInt();
				}

			}

			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Salario: ");
			salary = sc.nextDouble();
			listEmploye.add(new employe(id, name, salary));
		}

		System.out.println("Voce deseja realizar um aumento de Sálario certo?");
		sc.nextLine();
		read = sc.nextLine();
		if (read.equalsIgnoreCase("Sim")) {
			System.out.println("Digite o numero do ID do colaborador que deja realizar o aumento");
			id = sc.nextInt();
			for (employe emp : listEmploye) {
				while (emp.getId() != id) {
					System.out.println("Este ID não existe");
					id = sc.nextInt();
				}
				System.out.println("Funcionario: " + emp);
				System.out.println("Digite a porcentagem do aumento");
				perc = sc.nextInt();
				emp.empIncrise(perc);
				System.out.println("Ficha de colocaborador atualizada" + emp);

			}

		} else {
			System.out.println("Ok, tenha um bom dia");
		}

		System.out.println("Colaboradores");
		for (employe emp : listEmploye) {        
			System.out.println(emp);
		}

	}

}
