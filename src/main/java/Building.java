public interface Building {
    void workingHours();

    static void main(String[] args) {

        Building coffeeShop = () -> System.out.println("Кофейня работает с 8:00 до 20:00");

        Building store = new Building() {
            @Override
            public void workingHours() {
                System.out.println("Магазин работает с 9:00 до 21:00");
            }
        };

        Building university = new Building() {
            @Override
            public void workingHours() {
                System.out.println("Университет работает с 8:30 до 17:30");
            }
        };
        System.out.println("Режим работы Кофейни:");
        coffeeShop.workingHours();

        System.out.println("Режим работы Магазина:");
        store.workingHours();

        System.out.println("Режим работы Университета:");
        university.workingHours();
    }
}


