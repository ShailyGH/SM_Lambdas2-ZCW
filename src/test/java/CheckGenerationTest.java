import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class CheckGenerationTest {
    Person person1;
    Person person2;
    Person person3;
    Person person4;

    CheckGeneration ckGen = new CheckGeneration();

    @Before
    public void begin()
    {
        person1 = new Person("John", LocalDate.now().minusYears(65), Person.Sex.MALE, "JohnDoe@myemail.com");
        person2 = new Person("Jane", LocalDate.now().minusYears(55), Person.Sex.FEMALE, "JaneDoe@myemail.com");
        person3 = new Person("Jackie", LocalDate.now().minusYears(35), Person.Sex.FEMALE, "JackieDoe@myemail.com");
        person4 = new Person("Rockie", LocalDate.now().minusYears(27), Person.Sex.TRANS, "RockieDoe@myemail.com");
    }

    @Test
    public void getGenerationTest()
    {
        Assert.assertEquals("Baby Boomers", ckGen.getGeneration(person1));
        Assert.assertEquals("Generation X", ckGen.getGeneration(person2));
        Assert.assertEquals("Millennials", ckGen.getGeneration(person3));
        Assert.assertEquals("Generation Z", ckGen.getGeneration(person4));
    }

    @Test
    public void printPersonsTest() {
        ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(person1,person2,person3,person4));
        Person.printPersons(personList,new CheckGeneration());
    }
}
