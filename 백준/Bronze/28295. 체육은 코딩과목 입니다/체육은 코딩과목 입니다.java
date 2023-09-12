import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int direction = 0;
		for (int i = 0; i < 10; i++) {
			switch(sc.nextInt()) {
			case 1:
				direction += 90;
				break;
			case 2:
				direction += 180;
				break;
			case 3:
				direction -= 90;
				break;
			}
		}
		sc.close();
		direction = Math.abs(direction % 360);
		if (direction == 0) System.out.print("N");
		else if (direction == 90) System.out.println("E");
		else if (direction == 180) System.out.println("S");
		else if (direction == 270) System.out.println("W");
	}
}