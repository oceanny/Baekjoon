import java.util.Scanner;

public class Main{
    public static String TestVPS(String str) {
		String answer = "NO";
		String[] arr = str.split("");
		
		if (arr[0].equals(")") || arr[arr.length - 1].equals("(")) return answer;
		
		int lnum = 0;
		int rnum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")) lnum++;
			else rnum++;
			
			if (lnum < rnum) return answer;
		}
		
		if (lnum != rnum) return answer;
		
		answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();sc.nextLine();
		for (int i = 0; i < t; i++) {
			String str = sc.nextLine();
			System.out.println(TestVPS(str));
		}
	}
}