import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] value = new int[5];
		int avg = 0;
		int mid = 0;
		for (int i = 0; i < 5; i++) {
			value[i] = sc.nextInt();
			avg += value[i];
		}
		Arrays.sort(value);
		avg /= 5;
		mid = value[2];
		System.out.println(avg);
		System.out.println(mid);
	}
}