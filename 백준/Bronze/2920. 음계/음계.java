import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String ans = "";
		int[] arr = new int[8];
		int a = 0;
		int d = 0;
		
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 7; i++) {
			if (arr[i] == arr[i + 1] - 1) a++;
			else if (arr[i] == arr[i + 1] + 1) d++;
		}
		
		if (a == 7)	ans = "ascending";
		else if (d == 7) ans = "descending";
		else ans = "mixed";
		
		System.out.println(ans);
    }
}