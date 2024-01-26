import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String S = br.readLine();
			count = 0;
			System.out.println(isPalindrome(S) + " " + count);
		}
	}
	
	static int recursion(String S, int l, int r){
		count++;
	    if(l >= r) return 1;
	    else if(S.charAt(l) != S.charAt(r)) return 0;
	    else return recursion(S, l + 1, r - 1);
	}

	static int isPalindrome(String S){
	    return recursion(S, 0, S.length() - 1);
	}
}