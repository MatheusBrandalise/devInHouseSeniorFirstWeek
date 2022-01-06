package devInHouseSeniorFirstWeek;

import java.util.Scanner;

public class AllYouCanEatChampion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 214897;
		int pizzaSlices = 0;

		System.out.println("------------------------------------");
		System.out.println("----------RODÍZIO DE PIZZA----------");
		System.out.println("------------------------------------");

		do {
			System.out.println("\n" + "1 - Servir pizza sabor Calabresa.\n" + "2 - Servir pizza sabor Mussarela.\n"
					+ "3 - Servir pizza sabor Portuguessa.\n" + "0 - Encerrar o atendimento.");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Uma fatia de pizza sabor Calabresa servida!");
				pizzaSlices++;
				break;
			}
			case 2: {
				System.out.println("Uma fatia de pizza sabor Mussarela servida!");
				pizzaSlices++;
				break;
			}
			case 3: {
				System.out.println("Uma fatia de pizza sabor Portuguesa servida!");
				pizzaSlices++;
				break;
			}
			case 0: {
				System.out.println("\nTEMOS UM CAMPEÃO!!!!\n" + "O total de fatias comidas foi: " + pizzaSlices);
				break;
			}
			default:
				System.out.println("Opção invalida");
			}
		} while (option != 0);
		sc.close();
	}
}
