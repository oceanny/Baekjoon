import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] subjects = new int[5];
		for (int i = 0; i < T; i++) {
			if (st.hasMoreElements()) subjects[i] = Integer.parseInt(st.nextToken()); 
		}
		int number = 0;
		if (subjects[0] > subjects[2]) number += (subjects[0] - subjects[2]) * 508;
		else number += (subjects[2] - subjects[0]) * 108;
		if (subjects[1] > subjects[3]) number += (subjects[1] - subjects[3]) * 212;
		else number += (subjects[3] - subjects[1]) * 305;
		number += subjects[4] * 707;
		number *= 4763;
		System.out.println(number);
	}
}