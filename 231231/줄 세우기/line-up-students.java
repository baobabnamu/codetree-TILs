import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int height, weight, number;

    Student() {}

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if(student.height == this.height) {
            if(student.weight == this.weight) {
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1);
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++) {
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].number);
        }
    }
}