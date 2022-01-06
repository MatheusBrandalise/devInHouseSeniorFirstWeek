package devInHouseSeniorFirstWeek;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int limit = 2;
		int randomNumber = rand.nextInt(limit);
		
		System.out.println("O número aleatório gerado entre 0 e 1 é: " + randomNumber);

	}
}
