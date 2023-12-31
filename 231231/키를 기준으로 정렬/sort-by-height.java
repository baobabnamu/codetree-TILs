import java.util.*;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    int height, weight;

    Person() {};

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] persons = new Person[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(persons);

        for(int i=0; i<n; i++) {
            Person person = persons[i];
            System.out.printf("%s %d %d\n", person.name, person.height, person.weight);
        }
    }
}