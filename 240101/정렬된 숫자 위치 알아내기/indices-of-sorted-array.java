import java.util.*;
import java.io.*;

class Number implements Comparable<Number> {
    int value, id;

    Number() {}
    public Number(int value, int id) {
        this.value = value;
        this.id = id;
    }

    @Override
    public int compareTo(Number number) {
        return this.value - number.value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Number[] numbers = new Number[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            numbers[i] = new Number(Integer.parseInt(st.nextToken()), i + 1);
        }
       
        Arrays.sort(numbers);
        
        int[] id_to_rank = new int[n];
        for(int i=0; i<n; i++) {
            id_to_rank[numbers[i].id - 1] = (i+1);
        }

        for(int i=0; i<n; i++) {
            System.out.printf("%d ", id_to_rank[i]);
        }
    }
}