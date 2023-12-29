import java.util.*;
import java.io.*;

class SecretInformation {
    String secretCode;
    String meetingPoint;
    int time;

    SecretInformation(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        String place = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        SecretInformation info = new SecretInformation(code, place, time);
        System.out.printf("secret code : %s\n", info.secretCode);
        System.out.printf("meeting point : %s\n", info.meetingPoint);
        System.out.printf("time : %d", info.time);
    }
}