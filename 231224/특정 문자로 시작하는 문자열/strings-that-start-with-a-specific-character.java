// 해당 문자열 탐색
// 탐색에 해당하는 경우 문자열 길이 누적 및 문자열 갯수 카운팅

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        int n = Integer.parseInt(st.nextToken());

        // arr input
        String[] strArr = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            sb.setLength(0);
            sb.append(br.readLine());
            strArr[i] = sb.toString();
        }

        // arr searching
        String baseAlphabet = br.readLine();
        int sum = 0;
        int cnt = 0;
        for(String s : strArr) {
            if(s.charAt(0) == baseAlphabet.charAt(0)) {
                sum += s.length();
                cnt++;
            }
        }

        double avg = sum/cnt;
        System.out.printf("%d %.2f", cnt, avg);
    }
}