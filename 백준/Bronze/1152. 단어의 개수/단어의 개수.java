import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ", -1);
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ") || arr[i].equals(""))
				continue;
			else
				ans++;
		}
		System.out.println(ans);
    }
}