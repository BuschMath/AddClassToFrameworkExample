/*Here's an example of adding a custom class called Person 
    to the Java Collections Framework by implementing the 
    Comparable interface, which allows objects of the Person 
    class to be compared and sorted based on a specific 
    criterion, such as age: */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo() method from the Comparable interface
    @Override
    public int compareTo(Person other) {
        // Compare persons based on their age
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));
        people.add(new Person("Dave", 28));

        // Sort the list based on age
        Collections.sort(people);

        // Print the sorted list
        System.out.println("People sorted by age:");
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
