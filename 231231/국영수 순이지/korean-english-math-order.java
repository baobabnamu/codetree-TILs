import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    String name;
    int korScore, engScore, mathScore;

    Student() {}

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    @Override
    public int compareTo(Student student) {
        if(this.korScore == student.korScore) {
            if(this.engScore == student.engScore) {
                return student.mathScore - this.mathScore;
            }
            return student.engScore - this.engScore;
        }
        return student.korScore - this.korScore;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++) {
            Student student = students[i];
            System.out.printf("%s %d %d %d\n", student.name, student.korScore, student.engScore, student.mathScore);
        }
    }
}