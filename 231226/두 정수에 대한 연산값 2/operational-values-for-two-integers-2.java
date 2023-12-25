import java.util.*;
import java.io.*;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void modifyNumber(IntWrapper n, IntWrapper m) {
        if(n.value > m.value) {
            n.value *= 2;
            m.value += 10;
        } else {
            m.value *= 2;
            n.value += 10;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        IntWrapper n = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper m = new IntWrapper(Integer.parseInt(st.nextToken()));
        
        modifyNumber(n, m);
        System.out.printf("%d %d", n.value, m.value);
    }
}