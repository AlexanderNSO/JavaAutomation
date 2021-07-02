package Homework5;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[8];
        employeesArray[0] = new Employee("Petrov", "Petr", "Petrovic", "Engineer", "123@123.ru", 25000, 30);
        employeesArray[1] = new Employee("Ivanov", "Alexander", "Maksimovic", "QaEngineer", "124@123.ru", 140000, 40);
        employeesArray[2] = new Employee("Sidorov", "Ivan", "Alexandrovic", "Accountant", "125@123.ru", 60000, 41);
        employeesArray[3] = new Employee("Vasilevsky", "Maxim", "Vasilev", "Programmer", "126@123.ru", 250000, 39);
        employeesArray[4] = new Employee("Ian", "Petr", "Ivanovskii", "Director", "127@123.ru", 400000, 50);
        employeesArray[5] = new Employee("Nurmagomedov", "Khabib", "Valerevic", "Manager", "128@123.ru", 100000, 44);
        employeesArray[6] = new Employee("Tsoun", "Valerii", "Mikhailovic", "teacher", "129@123.ru", 25000, 36);
        employeesArray[7] = new Employee("Sviatov", "Nikolay", "Petrovic", "Lawyer", "120@123.ru", 70000, 25);


        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].getInfo();
            }
        }
    }
}