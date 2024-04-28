public class CheckGeneration implements CheckPerson {

    @Override
    public String getGeneration(Person person)
    {
        if (person.getAge() >= 61)
        {
            return "Baby Boomers";
        }
        else if (person.getAge() >= 44 && person.getAge() <= 60){
            return "Generation X";
        } else if (person.getAge() >= 28 && person.getAge() <= 43) {
            return "Millennials";
        } else if (person.getAge() >= 12 && person.getAge() <= 27) {
            return "Generation Z";
        }
        return "Generation group not found";
    }
}
