package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		int result = 1;

		System.out.println("Digite o valor que deseja calcular o fatorial entre 1 e 10:");
		value = sc.nextInt();
		int auxValue = value;

		if (value > 0 && value <= 10) {
			while (value > 1) {
				result *= value ;
				value--;
			}
			System.out.println("O fatorial de " + auxValue + " é " + result);
		} else {
			throw new IllegalArgumentException("O valor não é valido.");
		}

	}
}
