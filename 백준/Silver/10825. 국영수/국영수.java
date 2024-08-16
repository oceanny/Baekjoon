import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[] temp1 = o1.split(" ");
				String[] temp2 = o2.split(" ");
				
				String name1 = temp1[0];
				String name2 = temp2[0];
				
				int kor1 = Integer.parseInt(temp1[1]);
				int kor2 = Integer.parseInt(temp2[1]);
				
				int eng1 = Integer.parseInt(temp1[2]);
				int eng2 = Integer.parseInt(temp2[2]);
				
				int math1 = Integer.parseInt(temp1[3]);
				int math2 = Integer.parseInt(temp2[3]);
				
				if (kor1 == kor2) {
					if (eng1 == eng2) {
						if (math1 == math2) {
							return compareName(name1, name2);
						}
						else return math2 - math1;
					}
					else return eng1 - eng2;
				}
				else return kor2 - kor1;
					
			}

			private int compareName(String name1, String name2) {
				for (int i = 0; i < name1.length(); i++) {
					if (i >= name2.length()) return 1;
					if (name1.charAt(i) > name2.charAt(i)) return 1;
					else if (name1.charAt(i) < name2.charAt(i)) return -1;
				}
				return -1;
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i].split(" ")[0]);
		}
	}
}