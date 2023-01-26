package PPJ22.Task2;

import Extras.Warcaby.warcaby;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("Bob");
        Welder rob = new Welder("Robert", "I can weld stuff!");

        System.out.println(bob.display());
        System.out.println(rob.display());
    }

}
