import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int age1 = Integer.parseInt(st.nextToken());
        char gender1 = st.nextToken().charAt(0);

        st = new StringTokenizer(br.readLine());
        int age2 = Integer.parseInt(st.nextToken());
        char gender2 = st.nextToken().charAt(0);
        
        int result 
            = (age1 >= 19 && gender1 == 'M') || (age2 >= 19 && gender2 == 'M')
            ? 1 
            : 0;
        System.out.print(result);
    }
}