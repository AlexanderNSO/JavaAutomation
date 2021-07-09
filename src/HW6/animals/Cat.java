package HW6.animals;

public class Cat extends Animals {

    private static int count;

    public Cat(String name, int maximumRunDistance, int maximumSwimDistance) {
        super(name, "Кот", maximumRunDistance, maximumSwimDistance);
        count++;
    }

    public Cat(String name) {
        super(name, "Кот", 200, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

