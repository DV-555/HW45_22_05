import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws ParseException {

    Person person1 = new Person("Jack", "10.05.1990");
    Person person2 = new Person("John", "11.05.1980");
    List<Person> persons = new ArrayList<>();
    persons.add(person1);
    persons.add(person2);

    Collections.sort(persons);
    System.out.println(persons);
  }
}