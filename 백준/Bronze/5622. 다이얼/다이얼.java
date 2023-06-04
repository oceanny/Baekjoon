import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[8];
		int ans = 0;

		for (int i = 0; i < 8; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i) - 65;
			if (temp == 18)
				arr[5]++;
			else if (temp == 21)
				arr[6]++;
			else if (temp == 24 || temp == 25)
				arr[7]++;
			else
				arr[temp / 3]++;
		}

		for (int i = 0; i < arr.length; i++) {
			ans = ans + (i + 3) * arr[i];
		}
		System.out.println(ans);
    }
}