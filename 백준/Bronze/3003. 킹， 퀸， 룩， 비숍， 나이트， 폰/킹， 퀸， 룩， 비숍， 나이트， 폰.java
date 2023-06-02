import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int[] nor = {1, 1, 2, 2, 2, 8};
		int[] in = new int[nor.length];
		int[] ans = new int[nor.length];
		
		for (int i = 0; i < nor.length; i++) {
			in[i] = sc.nextInt();
			ans[i] = nor[i] - in[i];
			System.out.printf("%d ", ans[i]);
		}
    }
}