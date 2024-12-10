import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
		int x = 0, y = 0;
		int H = park.length;
		int W = park[0].length();
		char[][] map = new char[H][W];
		for (int i = 0; i < park.length; i++) {
			map[i] = park[i].toCharArray();
			if (park[i].contains("S")) {
				for (int j = 0; j < park[0].length(); j++) {
					if (map[i][j] == 'S') {
						y = i;
						x = j;
						break;
					}
				}
			}
		}

		StringTokenizer st;
		for (int i = 0; i < routes.length; i++) {
			st = new StringTokenizer(routes[i]);
			String dir = st.nextToken();
			int len = Integer.parseInt(st.nextToken());
			
			int nx = x, ny = y;
			boolean w_change = true;
			boolean minus = false;
			switch (dir) {
			case "E":
				nx += len;
				break;
			case "W":
				minus = true;
				nx -= len;
				break;
			case "N":
				w_change = false;
				minus = true;
				ny -= len;
				break;
			case "S":
				w_change = false;
				ny += len;
				break;
			}
			
			if (nx < 0 || nx >= W || ny < 0 || ny >= H) continue;
			if (w_change) {
				if (minus) {
					for (int j = x; j >= nx; j--) {
						if (map[y][j] == 'X') break;
						if (j == nx) x = nx;
					}
				}
				else {
					for (int j = x + 1; j <= nx; j++) {
						if (map[y][j] == 'X') break;
						if (j == nx) x = nx;
					}
				}
			}
			else {
				if (minus) {
					for (int j = y; j >= ny; j--) {
						if (map[j][x] == 'X') break;
						if (j == ny) y = ny;
					}
				}
				else {
					for (int j = y + 1; j <= ny; j++) {
						if (map[j][x] == 'X') break;
						if (j == ny) y = ny;
					}
				}
			}
		}
		
		answer[0] = y;
		answer[1] = x;
		return answer;
    }
}