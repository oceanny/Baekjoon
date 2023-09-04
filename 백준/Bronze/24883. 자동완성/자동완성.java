import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		if (str.equals("N") || str.equals("n")) System.out.print("Naver D2");
		else System.out.print("Naver Whale");
	}
}