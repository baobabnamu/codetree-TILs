import java.util.*;
import java.io.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {

    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = b.value;
        b.value = a.value;
        a.value = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        IntWrapper n = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper m = new IntWrapper(Integer.parseInt(st.nextToken()));

        swap(n, m);
        System.out.printf("%d %d", n.value, m.value);
    }
}