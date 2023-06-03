import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int[] ans = new int[26];
		String str = sc.next();
		char[] arr = new char[str.length()];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			int temp;
			if (arr[i] > 90)
				temp = arr[i] - 97;
			else
				temp = arr[i] - 65;
			if (ans[temp] == -1)
				ans[temp] = i;
		}

		for (int i = 0; i < ans.length; i++) {
			if (i == 0)
				System.out.printf("%d", ans[i]);
			else
				System.out.printf(" %d", ans[i]);
		}
    }
}