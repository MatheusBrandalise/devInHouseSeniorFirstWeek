package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class DoubleToIntConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number;
		
		System.out.println("Digite um número com duas ou mais casas decimais.");
		
		number = sc.nextDouble();
		sc.close();
		
		int intValue = (int) number;
		
		System.out.println("O número que você digitou convertido para o tipo inteiro é: " + intValue);
	}

}
