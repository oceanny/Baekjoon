import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int[] arr = new int[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		for (int i = 0; i < arr.length; i++) {
            // 선택 정렬 -> index의 증가를 위해 max를 i로 설정
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			if (arr[i] < arr[max]) {
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
            System.out.print(arr[i]);
		}
	}
}
