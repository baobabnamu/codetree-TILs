import java.io.*;
import java.util.*;

class Data implements Comparable<Data> {
    String day, date, weather;

    public Data(String day, String date, String weather) {
        this.day = day;
        this.date = date;
        this.weather = weather;
    }

    @Override
    public int compareTo(Data data) {
        String[] str1 = this.day.split("-");
        String[] str2 = data.day.split("-");

        if(str1[0].equals(str2[0])) {
            if(str1[1].equals(str2[0])) {
                return Integer.parseInt(str1[2]) - Integer.parseInt(str2[2]);
            }
            return Integer.parseInt(str1[1]) - Integer.parseInt(str2[1]);
        }
        return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Data[] datas = new Data[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            datas[i] = new Data(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(datas);

        for(Data data : datas) {
            if(data.weather.equals("Rain")) {
                System.out.printf("%s %s %s", data.day, data.date, data.weather);
                break;
            }
        }
    }
}