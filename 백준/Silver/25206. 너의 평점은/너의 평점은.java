import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		double total = 0;
		double div = 0;
		double ans = 0;

		for (int i = 0; i < 20; i++) {
			String str = sc.next();
			double num = sc.nextDouble();
			String score = sc.next();
			switch (score) {
			case "A+":
				total = total + num * 4.5;
				break;
			case "A0":
				total = total + num * 4.0;
				break;
			case "B+":
				total = total + num * 3.5;
				break;
			case "B0":
				total = total + num * 3.0;
				break;
			case "C+":
				total = total + num * 2.5;
				break;
			case "C0":
				total = total + num * 2.0;
				break;
			case "D+":
				total = total + num * 1.5;
				break;
			case "D0":
				total = total + num * 1.0;
				break;
			case "F":
				total = total + num * 0.0;
				break;
			default:
				break;
			}
			if (score.equals("P"))
				continue;
			div = div + num;
		}

		ans = total / div;
		System.out.println(ans);
    }
}