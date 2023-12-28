import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        String baseStr = stk.nextToken();
        
        List<String> strList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            if(str.length() < baseStr.length()) {
                continue;
            }
            String compareStr = str.substring(0, baseStr.length());
            if(baseStr.equals(compareStr)) {
                strList.add(str);
            }
        }

        String[] strArr = strList.stream().toArray(String[]::new);
        Arrays.sort(strArr);
        System.out.print(strArr[k-1]);
    }
}