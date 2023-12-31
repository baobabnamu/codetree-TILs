import java.util.*;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    double weight;

    Person() {}

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return person.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        Person[] persons = new Person[n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
        }

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for(int i=0; i<n; i++) {
            System.out.printf("%s %d %.1f\n", persons[i].name, persons[i].height, persons[i].weight);
        }

        Arrays.sort(persons);

        System.out.println("");
        System.out.println("height");
        for(int i=0; i<n; i++) {
            System.out.printf("%s %d %.1f\n", persons[i].name, persons[i].height, persons[i].weight);
        }
    }
}