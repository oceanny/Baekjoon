import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		int kor;
		int math;
		int ans;
		
		if (A % C != 0) kor = A / C + 1;
		else kor = A/ C;
		if (B % D != 0) math = B / D + 1;
		else math = B / D;
		
		ans = L - Math.max(kor, math);
		System.out.print(ans);
	}
}