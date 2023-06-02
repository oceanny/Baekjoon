import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		for(int i = 0; i < str.length / 2; i++) {
			if (!(str[i].equals(str[str.length - i - 1]))) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
    }
}