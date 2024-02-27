import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long[] f = new long[91];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long ans = fibo(n);
		System.out.println(ans);
	}

	private static long fibo(int n) {
		if (n == 1 || n == 2) return 1;
		if (f[n] != 0) return f[n];
		
		f[n] = fibo(n - 1) + fibo(n - 2);
		return f[n];
	}
}