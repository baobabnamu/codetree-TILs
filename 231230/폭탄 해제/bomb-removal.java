import java.util.*;
import java.io.*;

class Boom {
    String code;
    String color;
    int second;

    public Boom(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String inputCode = st.nextToken();
        String inputColor = st.nextToken();
        int inputSecond = Integer.parseInt(st.nextToken());

        Boom boom = new Boom(inputCode, inputColor, inputSecond);
        System.out.printf("code : %s\ncolor : %s\nsecond : %d", boom.code, boom.color, boom.second);
    }
}