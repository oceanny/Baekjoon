import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int ans = 0;

		st.push(Integer.parseInt(br.readLine()));
		for (int i = 0; i < n - 1; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				st.pop();
			} else
				st.push(temp);
		}
		
		if (st.empty()) ans = 0;
		
		else {
			while (!st.empty()) {
				ans += st.peek();
				st.pop();
			}
		}
		System.out.println(ans);
    }
}