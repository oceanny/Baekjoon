import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] alp = new int[26];
		int max = 0;
		char ans = ' ';
		int temp = 0;
		
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if (temp > 90) temp = temp - 97;
			else temp = temp - 65;
			alp[temp]++;
		}
		
		for (int i = 0; i < alp.length; i++) {
			if (max < alp[i]) {
			max = alp[i];
			ans = (char)(i + 65);
			temp = i;
			}
		}
		
		for (int i = 0; i < temp; i++) {
			if (max == alp[i]) ans = '?';
		}
		
		for (int i = temp + 1; i < alp.length; i++) {
			if (max == alp[i]) ans = '?';
		}
		
		System.out.println(ans);
    }
}