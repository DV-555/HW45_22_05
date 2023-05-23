import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {


  private final String name;
  private final Date birthDay;

  SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

  public Person(String name, String birthDay) throws ParseException {

    this.name = name;
    this.birthDay = formatter.parse(birthDay);
  }

  public String getName() {
    return name;
  }

  public Date getBirthDay() {
    return birthDay;
  }


  @Override
  public String toString() {
    return name + formatter.format(birthDay);

  }

  @Override
  public int compareTo(Person o) {
    return o.birthDay.compareTo(birthDay);
  }
}
