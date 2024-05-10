import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int comp = 10;
		
		while (N > comp) {
			int mod = N % comp;
			if (mod * 10 / comp >= 5) N += comp;
			N -= mod;
			comp *= 10;
		}
        
		System.out.println(N);
	}
}