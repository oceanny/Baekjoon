import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[1001];
		int avg = 0;
		for (int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine());
			avg += temp;
			num[temp]++;
		}
		int count = 0;
		int index = 0;
		for (int i = 10; i <= 1000; i += 10) {
			if (num[i] > count) {
				count = num[i];
				index = i;
			}
		}
		avg /= 10;
		System.out.printf("%d\n%d", avg, index);
	}
}