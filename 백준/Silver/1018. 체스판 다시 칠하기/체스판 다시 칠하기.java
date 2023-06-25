import java.util.Scanner;

public class Main {
	
	public static boolean[][] arr;
	
	public static int chess(boolean TF, int a, int b) {
		int count = 0;
		
		for (int i = a; i < a + 8; i++) {
			for (int j = b; j < b + 8; j++) {
				if (arr[i][j] != TF) count++;
				TF = !TF;
			}
			TF = !TF;
		}
        return Math.min(count, 64 - count);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		변수 선언
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		arr = new boolean[n][m];
		int ans = 64;

//		배열에 주어진 체스판 저장
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') arr[i][j] = true;
				else arr[i][j] = false;
			}
		}
		
		sc.close();
		
//		코드 길이가 길어지므로 따로 함수를 만듦
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int temp = chess(arr[i][j], i, j);
				if(temp  < ans) ans = temp;
			}
		}
//		출력
		System.out.println(ans);
	}

}