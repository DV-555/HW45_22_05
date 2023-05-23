import java.util.Date;

public class Person implements Comparable <Person> {

  private final String name;
  private final Date birthDay;


  public Person(String name, int birthDay){
    this.name= name;
    this.birthDay= birthDay;
  }

  public String getName() {
    return name;
  }

  public Date getBirthDay() {
    return birthDay;
  }


  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", birthDay='" + birthDay + '\'' +
        '}';
  }

  @Override
  public int compareTo(Person o) {
    return 0;
  }
}
