import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			scores[i] = sc.nextInt();
			if (scores[i] < 40) scores[i] = 40;
			total += scores[i];
		}
        sc.close();
		System.out.println(total / 5);
	}
	
}
