import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 파일 이름의 개수
		int n = Integer.parseInt(br.readLine());
		// 길이가 n인 문자열 배열 생성
		String[] arr = new String[n];
		// 배열에 파일 이름을 입력
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		// 파일 이름 길이가 모두 같음
		for (int i = 0; i < arr[0].length(); i++) {
			boolean same = true;
			// 한 글자씩 비교
			char c = arr[0].charAt(i);
			// 파일 개수만큼 비교
			for (int j = 1; j < n; j++) {
				if (c != arr[j].charAt(i)) {
					same = false;
					// 하나라도 다르면 더 비교할 필요가 없음
					break;
				}
			}
			// true면 글자를 그대로 출력
			if (same) sb.append(c);
			// false면 ?를 출력
			else sb.append("?");
		}
		
		System.out.println(sb);
	}
}
