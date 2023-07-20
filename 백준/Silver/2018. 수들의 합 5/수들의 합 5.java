import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// 변수 정의
		int count = 1; // n으로 나타내는 경우 포함
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
        // 처리
        while(end_index != n) {
        	if (sum == n) {
        		count++;
        		end_index++;
        		sum += end_index;
        	}
        	else if (sum > n) {
        		sum -= start_index;
        		start_index++;
        	}
        	else if (sum < n) {
        		end_index++;
        		sum += end_index;
        	}
        }
        
        // 출력
        System.out.println(count);
	}
}
