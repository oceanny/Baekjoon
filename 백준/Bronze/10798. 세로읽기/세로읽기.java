import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = "";
		String[][] str = new String[5][15];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				str[i][j] = "";
			}
		}
		
		for (int i = 0; i < 5; i++) {
			String[] temp = br.readLine().split("");
			for (int j = 0; j < temp.length; j++) {
				str[i][j] = temp[j];
			}
		}
		
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				ans += str[i][j];
			}
		}
		System.out.println(ans);
    }
}
