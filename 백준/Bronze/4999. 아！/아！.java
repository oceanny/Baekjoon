import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jaehwan = sc.nextLine();
		String doctor = sc.nextLine();
		sc.close();
        
		if (jaehwan.length() >= doctor.length()) System.out.println("go");
		else System.out.println("no");
	}
}
