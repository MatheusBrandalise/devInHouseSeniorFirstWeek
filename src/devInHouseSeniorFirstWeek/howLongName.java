package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class howLongName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome que você quer saber quantas letras possui.");
		
		String name = sc.next();
		
		System.out.println("O nome que você digitou possui " + name.length() + " letras");
		

	}

}
