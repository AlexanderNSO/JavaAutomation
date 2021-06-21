package Homework1;

public class HomeWorkApp {
    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        checkSumSign(4, 1);
        checkSumSign(-4, 1);
        printThreeWords();
        printColor(-7);
        printColor(0);
        printColor(100);
        printColor(101);
        compareNumbers(1, 2);
        compareNumbers(2, 1);
        compareNumbers(3, 3);
    }
}
