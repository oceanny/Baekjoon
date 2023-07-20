import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        // 처리
        while(!str.equals("#")) {
        	int ans = 0;
        	str = str.toLowerCase();
        	for (int i = 0; i < str.length(); i++) {
        		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') ans++;
        	}
        	sb.append(ans).append('\n');
        	str = br.readLine();
        }
        // 출력
        System.out.println(sb);
	}
}
