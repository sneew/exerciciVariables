package itExerciciVariables;

public class ItExerciciVariables {

	public static void main(String[] args) {
		
		//fase 1
		System.out.println("Fase 1:");
		String name = "Eloi";
		String lastName1 = "Fdez";
		String lastName2 = "Molina";
		int day = 29;
		int month = 1;
		int year = 1992;
		
		System.out.println(lastName1 + " " + lastName2 + ", " + name);
		System.out.println(day + "/" + month + "/" + year);
		
		//fase 2
		System.out.println("\nFase 2:");
		//final int YEAR_BASE = 1948; //fase2
		int YEAR_BASE = 1948; //fase3
		int leapYear = 0;
		
		for (int i = YEAR_BASE; i < year; i++) {
			if(((i%400) == 0) || ((i%4) == 0) && (i%100 != 0)) {
				leapYear++;
			}
		}
		
		System.out.println("hi ha un total de " + leapYear + " anys de traspas");
		
		//fase 3
		System.out.println("\nFase 3:");
		boolean isLeap = false;
		
		for (int i = YEAR_BASE; i <= year; i++) {
			if(((i%400) == 0) || ((i%4) == 0) && (i%100 != 0)) {
				System.out.println(i);
			}
		}
		
		if(((year%400) == 0) || ((year%4) == 0) && (year%100 != 0)) {
			isLeap = true;
		}
		
		if(isLeap) {
			System.out.println("l'any "+ year + " és un any de traspàs!");
		}else {
			System.out.println("l'any "+ year + " no és un any de traspàs");
		}
		
		//fase 4
		System.out.println("\nFase 4:");
		String sumName = name + " " + lastName1+ " " + lastName2;
		String sumYear = day + "/" + month + "/" + year;
		
		System.out.println(sumName);
		System.out.println(sumYear);
		
		if(isLeap) {
			System.out.println("El meu any és de traspàs!");
		}else {
			System.out.println("El meu any no és de traspàs");
		}

	}
}
