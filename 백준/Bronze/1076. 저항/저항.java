import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = 0;
		long b = 0;
		long c = 0;
		switch(br.readLine()) {
		case "black":
			a = 0;
			break;
		case "brown":
			a = 1;
			break;
		case "red":
			a = 2;
			break;
		case "orange":
			a = 3;
			break;
		case "yellow":
			a = 4;
			break;
		case "green":
			a = 5;
			break;
		case "blue":
			a = 6;
			break;
		case "violet":
			a = 7;
			break;
		case "grey":
			a = 8;
			break;
		case "white":
			a = 9;
			break;
		}
		switch(br.readLine()) {
		case "black":
			b = 0;
			break;
		case "brown":
			b = 1;
			break;
		case "red":
			b = 2;
			break;
		case "orange":
			b = 3;
			break;
		case "yellow":
			b = 4;
			break;
		case "green":
			b = 5;
			break;
		case "blue":
			b = 6;
			break;
		case "violet":
			b = 7;
			break;
		case "grey":
			b = 8;
			break;
		case "white":
			b = 9;
			break;
		}
		switch(br.readLine()) {
		case "black":
			c = 1;
			break;
		case "brown":
			c = 10;
			break;
		case "red":
			c = 100;
			break;
		case "orange":
			c = 1000;
			break;
		case "yellow":
			c = 10000;
			break;
		case "green":
			c = 100000;
			break;
		case "blue":
			c = 1000000;
			break;
		case "violet":
			c = 10000000;
			break;
		case "grey":
			c = 100000000;
			break;
		case "white":
			c = 1000000000;
			break;
		}
		System.out.println((a * 10 + b) * c);
	}
	
}
