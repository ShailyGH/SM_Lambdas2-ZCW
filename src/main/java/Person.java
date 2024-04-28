import java.time.LocalDate;
import java.util.*;

public class Person
{
    public enum Sex {
        MALE, FEMALE, TRANS
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return this.birthday.until(LocalDate.now()).getYears();
    }

    public Sex getGender(){
        return gender;
    }

    public void printPerson()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return "Person{" +
                "name +'" + name + '\'' +
                ", birthday =" + birthday +
                ", gender =" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
    public static void printPersons(List<Person> listOfPeople, CheckPerson ckPerson) {
        for (Person person : listOfPeople) {
            if (!Objects.equals(ckPerson.getGeneration(person), "Generation group not found")) {
                person.printPerson();
            }
        }
    }
}
