import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int fib_check = 0;
	static int fibo_check = 0;
	static int[] f = new int[41];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		f[1] = 1;
		f[2] = 1;
		
		fib(n);
		fibonacci(n);
		
		System.out.printf("%d %d", fib_check, fibo_check);
	}
	
	private static int fib(int n) {
		if (n == 1 || n == 2) {
			fib_check++;
			return 1;
		}
		else return (fib(n - 1) + fib(n - 2));
	}
	
	private static int fibonacci(int n) {
		for (int i = 3; i <= n; i++) {
		    f[i] = f[i - 1] + f[i - 2];
		    fibo_check++;
		}
	    return f[n];
	}
}