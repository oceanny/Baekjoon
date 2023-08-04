import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "" + sc.nextInt();
		String b = "" + sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		int reva = Integer.parseInt(sb.toString());
		
		sb = new StringBuilder();
		for (int i = b.length() - 1; i >= 0; i--) {
			sb.append(b.charAt(i));
		}
		int revb = Integer.parseInt(sb.toString());
		
		String ans = "" + (reva + revb);
		
		sb = new StringBuilder();
		for (int i = ans.length() - 1; i >= 0; i--) {
			sb.append(ans.charAt(i));
		}
		
		System.out.println(Integer.parseInt(sb.toString()));
	}
}
