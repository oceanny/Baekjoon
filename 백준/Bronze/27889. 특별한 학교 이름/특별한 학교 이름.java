import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		switch(name) {
		case "NLCS":
			System.out.println("North London Collegiate School");
			break;
		case "BHA":
			System.out.println("Branksome Hall Asia");
			break;
		case "KIS":
			System.out.println("Korea International School");
			break;
		case "SJA":
			System.out.println("St. Johnsbury Academy");
			break;
		}
	}
}
