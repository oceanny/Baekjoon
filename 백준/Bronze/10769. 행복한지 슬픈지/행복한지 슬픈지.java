import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		int happy = 0;
		int sad = 0;
		
		if (text.contains(":-)") || text.contains(":-(")) {
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ':' && i < text.length() - 2) {
					if (text.charAt(i + 1) == '-') {
						if (text.charAt(i + 2) == ')') {
							happy++;
							i += 2;
							continue;
						}
						if (text.charAt(i + 2) == '(') {
							sad++;
							i += 2;
						}
					}
				}
			}
		}
		
		if (happy + sad == 0)
			System.out.println("none");
		else if (happy == sad)
			System.out.println("unsure");
		else if (happy > sad)
			System.out.println("happy");
		else if (sad > happy)
			System.out.println("sad");
	}
}