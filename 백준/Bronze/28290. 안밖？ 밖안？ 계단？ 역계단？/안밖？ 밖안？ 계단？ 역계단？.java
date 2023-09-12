import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		if (str.equals("fdsajkl;") || str.equals("jkl;fdsa")) System.out.print("in-out");
		else if (str.equals("asdf;lkj") || str.equals(";lkjasdf")) System.out.print("out-in");
		else if (str.equals("asdfjkl;")) System.out.print("stairs");
		else if (str.equals(";lkjfdsa")) System.out.print("reverse");
		else System.out.print("molu");
	}
}