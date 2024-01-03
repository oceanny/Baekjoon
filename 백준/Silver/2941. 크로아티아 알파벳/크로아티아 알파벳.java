import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'c') {
				if (i < str.length() - 1 && (str.charAt(i + 1) == '-' || str.charAt(i + 1) == '=')) {
					count++;
					i++;
				}
				else count++;
			}
			else if (ch == 'd') {
				if (i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					count++;
					i += 2;
				}
				else if (i < str.length() - 1 && str.charAt(i + 1) == '-') {
					count++;
					i++;
				}
				else count++;
			}
			else if (ch == 'l') {
				if (i < str.length() - 1 && str.charAt(i + 1) == 'j') {
					count++;
					i++;
				}
				else count++;
			}
			else if (ch == 'n') {
				if (i < str.length() - 1 && str.charAt(i + 1) == 'j') {
					count++;
					i++;
				}
				else count++;
			}
			else if (ch == 's') {
				if (i < str.length() - 1 && str.charAt(i + 1) == '=') {
					count++;
					i++;
				}
				else count++;
			}
			else if (ch == 'z') {
				if (i < str.length() - 1 && str.charAt(i + 1) == '=') {
					count++;
					i++;
				}
				else count++;
			}
			else count++;
		}
		System.out.println(count);
	}
}
