import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 변수 정의
		int count = 0;
		int start_index = 0;
		int end_index = n - 1;
		int sum = 0;
		
        // 처리
		Arrays.sort(arr);
        while(start_index < end_index) {
        	sum = arr[start_index] + arr[end_index];
        	if (sum == m) {
        		count++;
        		start_index++;
        		end_index--;
        	}
        	else if (sum > m) {
        		end_index--;
        	}
        	else if (sum < m) {
        		start_index++;
        	}
        }
        
        // 출력
        System.out.println(count);
	}
}
