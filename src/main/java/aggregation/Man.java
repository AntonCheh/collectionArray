package aggregation;

import java.security.SecureRandom;

public class Man {
    private String name;
    Sword sword;

    public Man(String name, Sword sword) {
        this.name = name;
        this.sword = sword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
