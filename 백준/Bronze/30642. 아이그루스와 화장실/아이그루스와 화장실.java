import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K;
		switch(br.readLine()) {
		case "annyong":
			K = Integer.parseInt(br.readLine());
			if (K % 2 == 0 && K + 1 <= N) System.out.println(K + 1);
			else if (K % 2 == 0) System.out.println(K - 1);
			else System.out.println(K);
			break;
		case "induck":
			K = Integer.parseInt(br.readLine());
			if (K % 2 == 0) System.out.println(K);
			else if (K + 1 <= N) System.out.println(K + 1);
			else System.out.println(K - 1);
			break;
		}
	}
}