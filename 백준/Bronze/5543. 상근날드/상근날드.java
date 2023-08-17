import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burgers = new int[3];
		int[] drinks = new int[2];
		int burger = 2000;
		int drink = 2000;
		
		for (int i = 0; i < 3; i++) {
			burgers[i] = sc.nextInt();
			if (burgers[i] < burger) burger = burgers[i];
		}
		for (int i = 0; i < 2; i++) {
			drinks[i] = sc.nextInt();
			if (drinks[i] < drink) drink = drinks[i];
		}
		sc.close();
		
		System.out.println(burger + drink - 50);
	}
	
}
