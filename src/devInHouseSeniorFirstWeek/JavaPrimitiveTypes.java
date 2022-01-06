package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class JavaPrimitiveTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 128795;
		
		do {
			System.out.println("\nSobre qual tipo de dado primitivo Java você quer saber mais?\n"
					+"1 - Boolean\n"
					+"2 - Caracter\n"
					+"3 - Inteiro\n"
					+"4 - Real\n"
					+"0 - Encerrar");
		option = sc.nextInt();
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
		case 0:
			System.out.println("Pronto, agora você está muito mais bem informado sobre os tipos primitivos Java");
			break;
		default:
			System.out.println("Opção invalida.");
		}
		} while (option != 0);
		sc.close();
	}
}
