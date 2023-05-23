import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws ParseException {

    Person person1 = new Person("Jack", "10.05.2000");
    Person person2 = new Person("John", "11.05.1980");
    Person person3 = new Person("Dan","02.02.2005");
    Person person4 = new Person("Max","01.01.1975");
    List<Person> persons = new ArrayList<>();

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);

    System.out.println("\n" + "Before comparison " + "\n" + persons);
    Collections.sort(persons);
    System.out.println("\n" + "After comparison " + "\n" + persons);
  }
}