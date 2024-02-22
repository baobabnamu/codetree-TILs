import java.util.*;

public class Main {
    private static int[][] temps;
    private static int c, g, h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        temps = new int[n][2];
        int start = 1000;
        int end = 0;

        for(int i = 0; i < n; i++) {
            temps[i][0] = sc.nextInt();
            start = Math.min(start, temps[i][0]);
            temps[i][1] = sc.nextInt();
            end = Math.max(end, temps[i][1]);
        }

        // 최고 작업량 구하기
        // 1. 온도 범위 제한
        int ans = 0;
        for(int i = start; i <= end; i++) {
            // 2. 온도 범위에 따라 완탐
            int totalWorkload = 0;
            for(int j = 0; j < temps.length; j++) {
                totalWorkload += calcWorkload(i, j);
            }
            ans = Math.max(ans, totalWorkload);
        }

        System.out.print(ans);
    }

    // temp : 온도, index : 장비 인덱스
    private static int calcWorkload(int temp, int index) {
        int workload = 0;
        int Ta = temps[index][0];
        int Tb = temps[index][1];

        if(temp < Ta) {
            workload = c;
        } else if(temp >= Ta && temp <= Tb) {
            workload = g;
        } else {
            workload = h;
        }

        return workload;
    }
}