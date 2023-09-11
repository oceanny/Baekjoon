import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] arr = str.split("/");
		int K = Integer.parseInt(arr[0]);
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);
		if (D == 0 || K + A < D) System.out.print("hasu");
		else System.out.print("gosu");
	}
}