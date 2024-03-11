import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int total = 0;
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
			total += list[i];
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= total; i++) {
			int[] sumList = new int[M];

			int idx = 0;

			for (int k = 0; k < N; k++) {
				if (idx == M) {
					sumList[idx - 1] += list[k];
				} else if (sumList[idx] + list[k] > i) {
					k--;
					idx++;
				} else {
					sumList[idx] += list[k];
				}
			}

			int max = 0;
			for (int k = 0; k < sumList.length; k++) {
				max = Math.max(max, sumList[k]);
			}

			ans = Math.min(ans, max);
		}

		System.out.print(ans);
	}
}