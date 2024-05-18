import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		double finalPrice = 0.0;
		
		switch (code) {
			case 1:
				finalPrice = quantity * 4.0;
				break;
				
			case 2:
				finalPrice = quantity * 4.5;
				break;
				
			case 3:
				finalPrice = quantity * 5.0;
				break;
				
			case 4:
				finalPrice = quantity * 2.0;
				break;
				
			case 5:
				finalPrice = quantity * 1.5;
				break;
				
			default:
				System.out.println("Código inexistente!");				
			}
		
		System.out.printf("Total: R$ %.2f%n", finalPrice);
		
		sc.close();
	}
}
