package PPJ20;

public class Person {
    private String name;
    private int birthYear;
    
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person (String name) {
        this(name, 1990);
    }

    public String getName() {
        return this.name;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }
    public static Person getOlder(Person peep, Person anotherPeep){
        if( peep.getAge(0) > anotherPeep.getAge(0))
            return peep;
        return anotherPeep;
    }
    public static Person getOldest(Person[] peeps){
        Person oldestPeep = peeps[0];
        for (Person peep : peeps) {
            oldestPeep = Person.getOlder(oldestPeep, peep);
        }
        return oldestPeep;
    }
    
}
