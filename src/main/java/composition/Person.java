package composition;

import java.util.SplittableRandom;

public class Person {
    private String name;
    private Sword sword;

    public Person(String name, String swordName) {
        this.name = name;
        this.sword = new Sword(swordName);
    }
}
