package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu sobrenome?");
		String lastName = sc.next();
		
		System.out.println("Qual o seu nome?");
		String firstName = sc.next();

		System.out.println("Seu nome completo é: " + firstName + " " + lastName);
		sc.close();
	}

}
