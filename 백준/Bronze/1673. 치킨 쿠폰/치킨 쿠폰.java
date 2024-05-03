import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null)
		{
			StringTokenizer st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int chicken = n;
			
			while (n >= k)
			{
				chicken += n / k;
				n = n / k + n % k;
			}
			
			System.out.println(chicken);
			
			str = br.readLine();
		}
	}
}