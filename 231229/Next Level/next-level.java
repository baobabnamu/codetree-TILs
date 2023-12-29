import java.util.*;
import java.io.*;

class User {
    String userID;
    int userLV;

    public User() {
        this.userID = "codetree";
        this.userLV = 10;
    }

    public User(String userID, int userLV) {
        this.userID = userID;
        this.userLV = userLV;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        User userInfo = new User();
        System.out.printf("user %s lv %d\n", userInfo.userID, userInfo.userLV);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String inputUserID = st.nextToken();
        int inputUserLV = Integer.parseInt(st.nextToken());

        userInfo.userID = inputUserID;
        userInfo.userLV = inputUserLV;

        System.out.printf("user %s lv %d", userInfo.userID, userInfo.userLV);

    }
}