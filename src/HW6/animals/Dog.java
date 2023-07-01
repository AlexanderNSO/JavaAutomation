package HW6.animals;

public class Dog extends Animals {

    private static int count;

    public Dog(String name, int maximumRunDistance, int maximumSwimDistance) {
        super(name, "Собака", maximumRunDistance, maximumSwimDistance);
        count++;
    }

    public Dog(String name) {
        super(name, "Собака", 500, 30);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
