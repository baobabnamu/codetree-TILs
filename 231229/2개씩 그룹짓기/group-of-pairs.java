import java.util.*;
import java.io.*;

public class Main {
    public static int magicCalc(int[] arr) {
        Arrays.sort(arr);

        int min = 0;
        int max = 0;
        int maxIdx = arr.length - 1;
        int sum = 0;
        for(int i=0; i<arr.length/2; i++) {
            min = arr[i];
            max = arr[maxIdx--];
            if(sum < min+max) {
                sum = min+max;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        // 정렬 후 제일 큰 값과 작은 값끼리 묶기
        // 그래야 값이 분산됨.
        // 1. 2*N 만큼의 arr 생성
        // 2. 정렬 후 제일 큰값과 작은 값을 하나씩 빼서 최댓값 갱신

        int totalLen = 2*n;
        int[] arr = new int[totalLen];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<totalLen; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(magicCalc(arr));
    }
}