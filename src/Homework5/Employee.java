package Homework5;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private int salary;
    private int age;

    public Employee(String surname, String name, String patronymic, String position, String email, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(surname + " " + name + " " + patronymic + " " + position + " " + email + " " + salary + " " + age);
    }
}
