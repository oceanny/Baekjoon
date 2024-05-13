import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int N = Integer.parseInt(br.readLine());
		String[] teams = new String[N + 1];
		int[][] check = new int[N + 1][5];

		for (int i = 0; i < name.length(); i++) {
			switch (name.charAt(i)) {
			case 'L':
				check[0][0]++;
				break;
			case 'O':
				check[0][1]++;
				break;
			case 'V':
				check[0][2]++;
				break;
			case 'E':
				check[0][3]++;
				break;
			default:
				continue;
			}
		}

		for (int i = 1; i <= N; i++) {
			teams[i] = br.readLine();
			
			for (int j = 0; j < teams[i].length(); j++) {
				switch (teams[i].charAt(j)) {
				case 'L':
					check[i][0]++;
					break;
				case 'O':
					check[i][1]++;
					break;
				case 'V':
					check[i][2]++;
					break;
				case 'E':
					check[i][3]++;
					break;
				default:
					continue;
				}
			}

			int L = check[0][0] + check[i][0];
			int O = check[0][1] + check[i][1];
			int V = check[0][2] + check[i][2];
			int E = check[0][3] + check[i][3];

			check[i][4] = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
		}
		
		int max = check[1][4];
		String team = teams[1];
		
		for (int i = 2; i <= N; i++) {
			if (check[i][4] > max) {
				max = check[i][4];
				team = teams[i];
			}
			
			if (check[i][4] == max) {
				if (team.compareTo(teams[i]) > 0) {
					max = check[i][4];
					team = teams[i];
				}
			}
		}
		
		System.out.println(team);

	}
}