package Homework2;

import java.util.Scanner;

public class Homework2 {
    /**
     * Метод проверяющий что число лежит в интервале от 10 до 20
     **/
    public static boolean isWithinInterval10to20(int number1, int number2) {
        return number1 + number2 >= 10 && number1 + number2 <= 20;
    }

    /**
     * Метод проверяющий положительное число или отрицательное.
     **/
    public static void printValueNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    /**
     * Проверка отрицательное ли число.
     **/
    public static boolean checkNegativeNumber(int number) {
        return number < 0;
    }

    /**
     * Печать строк.
     **/
    public static void printStrings(String line, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(line);
        }
    }

    /**
     * Проверка года високосный он или нет.
     **/
    public static boolean checkLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку - ");
        String line = scanner.nextLine();
        System.out.print("Количество печати строки - ");
        int printCountLine = scanner.nextInt();
        printStrings(line, printCountLine);

        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Сумма чисел попадает в интервал от 10 до 20? " + isWithinInterval10to20(number1, number2));

        System.out.print("Введите число 3: ");
        int number3 = scanner.nextInt();
        printValueNumber(number3);

        System.out.print("Введите число 4: ");
        int number4 = scanner.nextInt();
        System.out.println("Число отрицательное? " + checkNegativeNumber(number4));

        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Високосный ли год? " + checkLeapYear(year));
    }
}