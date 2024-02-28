import java.util.Scanner;

public class Main {
    public static final int MAX_X = 10;
    public static final int MAX_N = 20;
    
    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i <= MAX_X; i++)
            for(int j = 0; j <= MAX_X; j++)
                for(int k = 0; k <= MAX_X; k++) {
                    boolean success = false;
                    for(int l = 0; l < n; l++) {
                        if(x[l] == i || x[l] == j || x[l] == k) ans = 1;
                        else if(x[l] == i || x[l] == j || y[l] == k) ans = 1;
                        else if(x[l] == i || y[l] == j || y[l] == k) ans = 1;
                        else ans = 1;
                    }
                }

        System.out.print(ans);
    }
}