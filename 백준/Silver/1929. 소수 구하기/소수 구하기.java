import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (solution(i)) System.out.println(i);
		}
	}
    
	public static boolean solution(int n) {
		boolean answer = true;
        
        if (n < 2) return false;
        
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return answer;
	}
}