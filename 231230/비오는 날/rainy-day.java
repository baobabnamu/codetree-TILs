import java.io.*;
import java.util.*;

class WeatherData {
    String date;
    String day;
    String weather;

    public WeatherData() {
        this.date = "";
        this.day = "";
        this.weather = "";
    }

    public WeatherData(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {

    public static int[] getRainIndexes(WeatherData[] datas) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i=0; i<datas.length; i++) {
            if(datas[i].weather.equals("Rain")) {
                indexes.add(i);
            }
        }        

        return indexes.stream().mapToInt(x->x).toArray();
    }

    public static WeatherData getRecentlyRainDay(int[] rainIdxs, WeatherData[] datas) {
        int answerIdx = 0;

        if(rainIdxs.length == 1) {
            return datas[rainIdxs[0]];
        } else {
            for(int i=0; i<rainIdxs.length-1; i++) { 
                int curIdx = rainIdxs[i];
                int compareIdx = rainIdxs[i+1];
                if(datas[curIdx].date.compareTo(datas[compareIdx].date) < 0 ) {
                    answerIdx = curIdx;
                } else {
                    answerIdx = compareIdx;
                }
            }
        }

        return datas[answerIdx];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        WeatherData[] datas = new WeatherData[n];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();
            datas[i] = new WeatherData(date, day, weather);
        }

        // rain인 애들을 저장하는 인덱스 배열 생성 > 제일 근시일 저장 > 선형 탐색
        int[] rainIdxs = getRainIndexes(datas);
        WeatherData recentlyRainDayData = getRecentlyRainDay(rainIdxs, datas);
        System.out.printf("%s %s %s", recentlyRainDayData.date, recentlyRainDayData.day, recentlyRainDayData.weather);
    }
}