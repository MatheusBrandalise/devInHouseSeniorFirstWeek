package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class CousinPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean aux = true;

		System.out.println("Digite um número inteiro para verficar se ele é primo\n");
		number = sc.nextInt();
		sc.close();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				aux = false;
			}
		}
		if (aux == true) {
			System.out.println(number + " é um número primo.");
		} else {
			System.out.println(number + " não é um número primo.");
		}
	}
}
