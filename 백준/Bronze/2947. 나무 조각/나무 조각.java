import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		while(true) {
			if (num[0] == 1 && num[1] == 2 && num[2] == 3 && num[3] == 4 && num[4] == 5)
				break;
			
			for (int i = 0; i < 4; i++) {
				if (num[i + 1] < num[i]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					
					for (int j = 0; j < 5; j++) {
						System.out.printf("%d", num[j]);
						if (j != 4) System.out.printf(" ");
						else System.out.println();
					}
				}
			}
		}
	}
}