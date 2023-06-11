import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
//		단어 차례대로 입력받기
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
//		단어 정렬
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		bw.write(str[0] + "\n");
		for (int i = 1; i < n; i++) {
			if (str[i].equals(str[i - 1]))
				continue;
			bw.write(str[i] + "\n");
		}

		bw.flush();
    }
}