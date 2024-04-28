import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void begin()
    {
        person1 = new Person("John", LocalDate.now().minusYears(50), Person.Sex.MALE, "JohnDoe@myemail.com");
        person2 = new Person("Jane", LocalDate.now().minusYears(45), Person.Sex.FEMALE, "JaneDoe@myemail.com");
        person3 = new Person("Jackie", LocalDate.now().minusYears(25), Person.Sex.FEMALE, "JackieDoe@myemail.com");
    }

    @Test
    public void getAgeTest()
    {
        Assert.assertEquals(50, person1.getAge());
        Assert.assertEquals(45, person2.getAge());
        Assert.assertEquals(25, person3.getAge());
    }
}