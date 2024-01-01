import java.util.*;
import java.io.*;

class Point implements Comparable<Point> {
    int x, y, number;

    Point() {}

    public Point(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Point point) {
        int thisDistance = Math.abs(this.x) + Math.abs(this.y);
        int pointDistance = Math.abs(point.x) + Math.abs(point.y);
        if(thisDistance == pointDistance) {
            return this.number - point.number;
        }
        return thisDistance - pointDistance;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1);
        }
 
        Arrays.sort(points);

        for(int i=0; i<n; i++) {
            System.out.println(points[i].number);
        }
    }
}