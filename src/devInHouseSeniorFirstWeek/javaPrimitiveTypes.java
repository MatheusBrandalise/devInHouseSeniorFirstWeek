package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class javaPrimitiveTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sobre qual tipo de dado primitivo Java você quer saber mais?");
		System.out.println("1 - Boolean");
		System.out.println("2 - Caracter");
		System.out.println("3 - Inteiro");
		System.out.println("4 - Real");
		
		int option = sc.nextInt();
		
		switch(option){
		case 1:
			System.out.println("Boolean - Conjunto de valores falso ou verdadeiro.");
			break;
		case 2:
			System.out.println("Caracter - Qualquer conjunto de caracteres alfanuméricos.");
			break;
		case 3:
			System.out.println("Inteiro - Qualquer número inteiro, seja ele negativo, nulo ou positivo.");
			break;
		case 4:
			System.out.println("Real - Qualquer número real, seja ele negativo, nulo ou positivo.");
			break;
		default:
			throw new IllegalArgumentException("Essa não é uma opção válida");
		}
		
	}
}
