import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n;
		int total;
		int avg;
		int[] score = {};
		int per;
		double ans;

		for (int i = 0; i < count; i++) {
			n = sc.nextInt();
			score = new int[n];
			total = 0;
			avg = 0;
			ans = 0;
			per = 0;

			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				total = total + score[j];
			}

			avg = total / n;

			for (int j = 0; j < n; j++) {
				if (score[j] > avg)
					per++;
			}
			ans = (double) per / (double) n * 100.0;
			System.out.println(String.format("%.3f", ans) + "%");
		}
    }
}