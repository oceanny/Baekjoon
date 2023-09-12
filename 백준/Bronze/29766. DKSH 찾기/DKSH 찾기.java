import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int ans = 0;
		if (!str.contains("DKSH")) System.out.print(ans);
		else {
			for (int i = 0; i < str.length() - 3; i++) {
				boolean D = false;
				boolean K = false;
				boolean S = false;
				boolean H = false;
				if (str.charAt(i) == 'D') {
					D = true;
					if (str.charAt(i + 1) == 'K') {
						K = true;
						if (str.charAt(i + 2) == 'S') {
							S = true;
							if (str.charAt(i + 3) == 'H') {
								H = true;
							}
						}
					}
				}
				if (D && K && S && H) ans++;
			}
			System.out.print(ans);
		}
	}
}