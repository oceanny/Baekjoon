import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int ans = n;

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] arr = str.split("");
			String temp = arr[0];
			int num = arr.length;
			
			
			while (num > 1) {
				for (int j = 1; j < arr.length; j++) {
					num = num - 1;
					if (!(temp.equals(arr[j]))) {
						for (int k = 0; k < j; k++) {
							if (arr[j].equals(arr[k])) {
								ans = ans - 1;
								num = 0;
								break;
							}
						}
						temp = arr[j];
						if (num == 0) break;						
					}
				}
			}
		}

		System.out.println(ans);
    }
}