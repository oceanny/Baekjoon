import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = -1;
		
		while(!(n == 0)) {
			n = sc.nextInt();
			if (n == 0) break;
			String str = "" + n;
			String[] arr = str.split("");
			boolean ans = true;
			for (int i = 0; i < arr.length / 2; i++) {
				ans = ans && (arr[i].equals(arr[arr.length - 1 - i]));
			}
			
			if (ans) System.out.println("yes");
			else System.out.println("no");
			
		}
    }
}