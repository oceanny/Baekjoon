import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] my;
	static int[] check;
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); // 문자열 길이
		int p = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
		char[] a = new char[s]; // 문자열 저장 배열
		check = new int[4]; // 최소 개수
		my = new int[4]; // 현재 문자열의 개수
		checkSecret = 0; // 충족 개수 판단 변수
		int ans = 0; // checkSecret이 4일 때 1 추가

		a = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			check[i] = Integer.parseInt(st.nextToken());
			if (check[i] == 0)
				checkSecret++;
		}

		for (int i = 0; i < p; i++) {
			Add(a[i]);
		}
		
		if (checkSecret == 4) ans++;
		
		// 슬라이딩 윈도우 구현
		for (int i = p; i < s; i++) {
			// j는 첫 문자, i는 끝 문자
			int j = i - p;
			Add(a[i]);
			Remove(a[j]);
			if (checkSecret == 4) ans++;
		}
		// 출력
		System.out.println(ans);
		br.close();

	}

	private static void Add(char c) {
		switch (c) {
		case 'A':
			my[0]++;
			if (my[0] == check[0]) checkSecret++;
			break;
		case 'C':
			my[1]++;
			if (my[1] == check[1]) checkSecret++;
			break;
		case 'G':
			my[2]++;
			if (my[2] == check[2]) checkSecret++;
			break;
		case 'T':
			my[3]++;
			if (my[3] == check[3]) checkSecret++;
			break;
		}
	}
	
	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if (my[0] == check[0]) checkSecret--;
			my[0]--;
			break;
		case 'C':
			if (my[1] == check[1]) checkSecret--;
			my[1]--;
			break;
		case 'G':
			if (my[2] == check[2]) checkSecret--;
			my[2]--;
			break;
		case 'T':
			if (my[3] == check[3]) checkSecret--;
			my[3]--;
			break;
		}
		
	}
}
