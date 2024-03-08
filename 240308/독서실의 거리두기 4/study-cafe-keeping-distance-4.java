import java.util.*;

public class Main {

    private static int n;
    private static int[] space;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        space = new int[n];
        String inputData = sc.next();
        for(int i = 0; i < n; i++) 
            space[i] = inputData.charAt(i) - 48;

        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(space[i] != 0) continue;
            space[i] = 1; 
            for(int j = i + 1; j < n; j++) {
                if(space[j] != 0) continue;
                space[j] = 1; 
                ans = Math.max(ans, calcDistance());
                space[j] = 0; 
            }
            space[i] = 0;
        }

        System.out.print(ans);
    }

    private static int calcDistance() {
        int[] seatIndexes = new int[n];
        int seatIndexesSize = 0;
        for(int i = 0; i < n; i++) 
            if(space[i] == 1) 
                seatIndexes[seatIndexesSize++] = i;

        int distance = 101;
        for(int i = 1; i < seatIndexesSize; i++) 
            distance = Math.min(seatIndexes[i] - seatIndexes[i - 1], distance);

        return distance;
    }
}