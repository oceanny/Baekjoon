import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] triangle = new int[3];
		triangle[0] = Integer.parseInt(st.nextToken());
		triangle[1] = Integer.parseInt(st.nextToken());
		triangle[2] = Integer.parseInt(st.nextToken());
		while(!(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0)) {
			Arrays.sort(triangle);
			if (triangle[2] >= triangle[0] + triangle[1]) System.out.println("Invalid");
			else if (triangle[0] == triangle[2]) System.out.println("Equilateral");
			else if (triangle[0] == triangle[1] || triangle[1] == triangle[2]) System.out.println("Isosceles");
			else System.out.println("Scalene");
			st = new StringTokenizer(br.readLine());
			triangle[0] = Integer.parseInt(st.nextToken());
			triangle[1] = Integer.parseInt(st.nextToken());
			triangle[2] = Integer.parseInt(st.nextToken());
		}
	}
}