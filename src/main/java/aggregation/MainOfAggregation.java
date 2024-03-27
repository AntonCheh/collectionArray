package aggregation;

public class MainOfAggregation {
    public static void main(String[] args) {
        Sword sword = new Sword("sword");
        Man man = new Man("Alex", sword);
        Man man1 = new Man("Sergei", sword);
    }
}
