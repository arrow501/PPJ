package PPJ20;

import java.util.Arrays;

public class Task2 {
    private static int currentYear = 2022;
    public static void main(String[] args) {

        Person Arrow = new Person("Arrow", 2001);
        Person Chaco = new Person("Chaco", 2002);
        Person Kate = new Person("Kate", 1998);
        Person Greg = new Person( "Drew", 2003);

        Person[] people = {Arrow,Chaco,Kate, Greg};

        Person older = Person.getOlder(Chaco,Arrow);
        System.out.println( older.getName() + " is older and is " + older.getAge(currentYear) + " years old.");

        System.out.println();

        System.out.print("Out of ");
        // list names
        for (int i = 0; i < people.length; i++){
            System.out.print(people[i].getName());
            if (people.length > 1 && i == people.length - 2)
                System.out.print(" and ");
            else
                System.out.print(", ");
        }
        Person oldestPerson = Person.getOldest(people);
        System.out.print("the oldest one is " + oldestPerson.getName() +
            ", who is " + oldestPerson.getAge(currentYear) + " years old." );
        System.out.println("\n");

        // sorting
        sortByAge(people);
        System.out.println("From youngest to oldest:");
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge(currentYear) + " years old.");
        }

    }
    public static void sortByAge(Person[] people) {
        Arrays.sort(people, (p1, p2) -> p1.getAge(currentYear) - p2.getAge(currentYear));
    }
}
