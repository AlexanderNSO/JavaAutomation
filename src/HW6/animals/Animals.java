package HW6.animals;

public class Animals {
    String name;
    String type;
    private static int count;

    int maximumRunDistance;
    int maximumSwimDistance;

    public Animals(String name, String type, int maximumRunDistance, int maximumSwimDistance) {
        this.name = name;
        this.type = type;
        this.maximumRunDistance = maximumRunDistance;
        this.maximumSwimDistance = maximumSwimDistance;
        count++;
    }

    public void run(int distance) {
        if (maximumRunDistance == 0) {
            System.out.printf("%s %s не умеет бегать\n", type, name);
            return;
        }

        if (distance < 0) {
            System.out.println("Для бега введите положительное число");
            return;
        }

        if (distance <= maximumRunDistance) {
            System.out.printf("%s %s успешно пробежал %d метров\n", type, name, distance);
        } else {
            System.out.printf("%s %s не смог пробежать %d метров\n", type, name, distance);
        }
    }

    public void swim(int distance) {
        if (maximumSwimDistance == 0) {
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }

        if (distance < 0) {
            System.out.println("Для плавания введите положительное число");
            return;
        }

        if (distance <= maximumSwimDistance) {
            System.out.printf("%s %s успешно проплыл %d метров\n", type, name, distance);
        } else {
            System.out.printf("%s %s не смог проплыть %d метров\n", type, name, distance);
        }
    }

    public static int getCount() {
        return count;
    }
}
