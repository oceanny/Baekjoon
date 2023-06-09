import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
        
//      n이 1000000 이하이므로 각 자리가 9인 경우가 최소 -> 54를 뺀 숫자부터 시작
		for (int i = n - 54; i < n; i++) {
			int sum = i;
			String str = "" + i;
			int[] num = new int[str.length()];
			int temp = Integer.parseInt(str);
            
//			num에 하나씩 저장
			while (temp != 0) {
				for (int j = str.length() - 1; j >= 0; j--) {
					num[j] = temp % 10;
					temp = temp / 10;
				}
			}

			for (int j = 0; j < num.length; j++) {
				sum += num[j];
			}

			if (sum == n) {
				ans = i;
				break;
			}
		}
		System.out.print(ans);
    }
}