package devInHouseSeniorFirstWeek;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SemesterAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> notes = new ArrayList<Double>();
		
		System.out.println("Vamos calcular a média das suas três disciplinas do semestre.");
		
		System.out.println("Digite a nota da sua primeira matéria:");
		double noteFirtsDiscipline = sc.nextDouble();
		notes.add(noteFirtsDiscipline);
		
		System.out.println("Digite a nota da sua segunda matéria:");
		double noteSecondDiscipline = sc.nextDouble();
		notes.add(noteSecondDiscipline);
		
		System.out.println("Digite a nota da sua terceira matéria:");
		double noteThirdDiscipline = sc.nextDouble();
		notes.add(noteThirdDiscipline);
		
		double sum = notes.stream().mapToDouble(Double:: doubleValue).sum();
				
		double average = (sum / notes.size());
		
		//Tratamento casas decimais
		DecimalFormat df = new DecimalFormat("0.00");
		String string = df.format(average);
	    String[] part = string.split("[,]");
	    String string2 = part[0]+"."+part[1];
	    double finalAverage = Double.parseDouble(string2);
		
		System.out.println("A média do seu semestre é: " + finalAverage);
		sc.close();
	}

}
