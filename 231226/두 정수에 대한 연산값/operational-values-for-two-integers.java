import java.util.*;
import java.io.*;

class IntWrapper {
    int value;
    public IntWrapper(int value) {
        this.value = value;
    }  
}

public class Main {
    public static void modifyNumber(IntWrapper n, IntWrapper m) {
        if (n.value > m.value) {
            n.value += 25;
            m.value *= 2;
        } else {
            m.value += 25;
            n.value *= 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        IntWrapper a = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper b = new IntWrapper(Integer.parseInt(st.nextToken()));        

        modifyNumber(a, b);
        System.out.printf("%d %d ", a.value, b.value);
    }
}