import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    String name;
    int subject1, subject2, subject3;

    Student() {}

    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public int compareTo(Student student) {
        int thisSum = this.subject1+this.subject2+this.subject3;
        int studentSum = student.subject1+student.subject2+student.subject3;

        return thisSum - studentSum;
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
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].subject1, students[i].subject2, students[i].subject3);
        }
    }
}