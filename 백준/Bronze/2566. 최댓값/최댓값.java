import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int[][] num = new int [9][9];
        int temp = 0;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (num[i][j] >= temp) {
					temp = num[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		
		System.out.println(temp);
		System.out.printf("%d %d", a, b);
    }
}