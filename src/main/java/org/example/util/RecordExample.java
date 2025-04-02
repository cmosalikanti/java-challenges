package org.example.util;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;

public class RecordExample {
    public static void main(String[] args) {
        List<Person> persons = asList(new Person("Brian", "Hole"), new Person("Elon", "Musk"), new Person("Tom", "Musk"));

        persons
                .stream()
                .filter(person -> person.lastName().equals("Musk"))
                .forEach(person -> System.out.println(person.firstName()));

        Map<String, List<Person>> map = persons.stream().collect(groupingBy(person -> person.lastName()));
        map.keySet().stream().forEach(name -> System.out.println(name));
        map.keySet().stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
    }
}

/** Java 16 - Records are a new feature that helps model immutable data in a more concise way.
 *  It generates boilerplate code like constructors, toString(), hashCode(), and equals() automatically.
 *
 * @param firstName
 * @param lastName
 */
record Person(String firstName, String lastName) {}
