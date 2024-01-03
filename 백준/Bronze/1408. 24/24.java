import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int nowH = Integer.parseInt(st.nextToken());
		int nowM = Integer.parseInt(st.nextToken());
		int nowS = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), ":");
		int sttH = Integer.parseInt(st.nextToken());
		int sttM = Integer.parseInt(st.nextToken());
		int sttS = Integer.parseInt(st.nextToken());
		
		if (nowH > sttH) sttH += 24;
		
		int rest = sttH * 3600 + sttM * 60 + sttS - (nowH * 3600 + nowM * 60 + nowS);
		System.out.printf("%02d:%02d:%02d", rest / 3600, rest % 3600 / 60, rest % 60);
	}
}
