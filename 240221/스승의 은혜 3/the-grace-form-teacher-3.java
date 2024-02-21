import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int[][] hopeProduct = new int[n][2];
		int max = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				hopeProduct[i][j] = sc.nextInt();
			}
		}

		// 가격과 배송비의 합으로 정렬
		Arrays.sort(hopeProduct, Comparator.comparingInt(a -> IntStream.of(a).sum()));

		for(int i = 0; i < n; i++){
			int sum = 0;
			int count = 0;
			for(int j = 0; j < n; j++){
				int temp = 0;
				if(i == j){
					temp = hopeProduct[j][0] / 2 + hopeProduct[j][1];
				}else{
					temp = hopeProduct[j][0] + hopeProduct[j][1];
				}
				if(sum + temp <= b){
					sum += temp;
					count++;
				}
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}