import java.io.*;

public class Main {
    public static int cnt = 0;
    public static int count(int n) {
        if(n==1) {
            return cnt;
        }

        if(n%2==0) {
            cnt++;
            return count(n/2);
        } else {
            cnt++;
            return count((n*3)+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(count(n));
    }
}