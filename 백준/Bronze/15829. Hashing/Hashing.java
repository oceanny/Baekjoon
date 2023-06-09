import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String str = sc.next();
		char[] ch = new char[l];
		long ans = 0;
		for (int i = 0; i < l; i++) {
			ch[i] = str.charAt(i);
			ans += (ch[i] - 96) * Math.pow(31, i) % 1234567891;
		}
		System.out.println(ans);
    }
}