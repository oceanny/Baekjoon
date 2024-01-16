import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word1 = br.readLine().toCharArray();
		char[] word2 = br.readLine().toCharArray();
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		int index = 0;
		int count = 0;
		for (int i = 0; i < word1.length; i++) {
            if (index >= word2.length) break;
			if (word1[i] == word2[index]) {
				index++;
				count++;
			}
			else if (word1[i] > word2[index]) {
				index++;
				i--;
			}
			else {
				continue;
			}
		}
		System.out.println(word1.length + word2.length - count * 2);
	}
}