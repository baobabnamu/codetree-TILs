import java.util.*;
import java.io.*;

class PeopleInformation {
    String name;
    String addr;
    String city;

    public PeopleInformation() {
        this.name = "";
        this.addr = "";
        this.city = "";
    }

    public PeopleInformation(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PeopleInformation[] infos = new PeopleInformation[n];
        String[] names = new String[n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String addr = st.nextToken();
            String city = st.nextToken();
            infos[i] = new PeopleInformation(name, addr, city);
            names[i] = name;
        }

        Arrays.sort(names);

        for(int i=0; i<n; i++) {
            if(names[n-1] == infos[i].name) {
                System.out.println("name "+infos[i].name);
                System.out.println("addr "+infos[i].addr);
                System.out.println("city "+infos[i].city);
            }
        }
    }
}