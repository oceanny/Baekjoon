import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int q1 = 0;
	static int q2 = 0;
	static int q3 = 0;
	static int q4 = 0;
	static int axis = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			check(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}
	private static void check(int x, int y) {
		if (x == 0 || y == 0) axis++;
		else if (x > 0 && y > 0) q1++;
		else if (x > 0 && y < 0) q4++;
		else if (x < 0 && y > 0) q2++;
		else if (x < 0 && y < 0) q3++;
	}
}