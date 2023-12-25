import java.util.*;
import java.io.*;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void abs(IntWrapper iw) {
        iw.value = iw.value < 0 ? iw.value * -1 : iw.value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            IntWrapper iw = new IntWrapper(Integer.parseInt(st.nextToken()));
            abs(iw);
            System.out.printf("%d ", iw.value);
        }
    }
}