package application;

import java.util.Locale;
import java.util.Scanner;

import models.Model_Personal;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double heigth;
		char sex;
		double greaterHeigth = 0;
		double shorterHeigth = 0;
		double counter = 0;
		double averageF = 0;
		double averageM = 0;

		System.out.println("Vamos calcular a media de altura do sexo respectivo");
		System.out.println("Qunatas pessoa voce deseja calcular?");
		int n = sc.nextInt();
		Model_Personal[] v = new Model_Personal[n];
		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Digite a altura da " + (i + 1) + " pessoa");
			heigth = sc.nextDouble();
			System.out.println("Digite o sexo da " + (i + 1) + " pessoa");
			sex = sc.next().charAt(0);
			v[i] = new Model_Personal(heigth, sex);
		}
		

		for (int i = 0; i < n; i++) {

			if (v[i].getHeigth() > greaterHeigth) {
				greaterHeigth = v[i].getHeigth();
				counter = greaterHeigth;
			}

		}
		for (int i = 0; i < n; i++) {

			if (v[i].getHeigth() < counter) {
				counter = v[i].getHeigth();
				shorterHeigth = counter;
			}

		}
		System.out.println("Maior altura = " + greaterHeigth);
		System.out.println("Menor altura = " + shorterHeigth);
		double counterF = 0;
		double counterM = 0;
		for (int i = 0; i < n; i++) {

			if (v[i].getSex() == 'F') {
				averageF = averageF + v[i].getHeigth();
				counterF++;
			}

		}
		for (int i = 0; i < n; i++) {

			if (v[i].getSex() == 'M') {
				averageM = averageM + v[i].getHeigth();
				counterM++;
			}

		}
		System.out.println("Media de altura entre as mulheres " + averageF / counterF);
		System.out.println("Numero de mulheres = " + counterF);
		System.out.println("Media de altura entre os homens " + averageM / counterM);
		System.out.println("Numero de mulheres = " + counterM);

	}

}
