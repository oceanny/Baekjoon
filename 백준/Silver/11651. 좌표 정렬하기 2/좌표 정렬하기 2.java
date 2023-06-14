import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			}
			
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] temp1 = s1.split(" ");
				int a1 = Integer.parseInt(temp1[1]);
				String[] temp2 = s2.split(" ");
				int a2 = Integer.parseInt(temp2[1]);
				
				if (a1 == a2) {
					int o1 = Integer.parseInt(temp1[0]);
					int o2 = Integer.parseInt(temp2[0]);
					return o1 - o2;
				}
				
				else {
					return a1 - a2;
				}
			}
			
		});
		
		for (int i = 0; i < n; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
    }
}