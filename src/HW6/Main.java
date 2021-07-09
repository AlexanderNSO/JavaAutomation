package HW6;

import HW6.animals.Animals;
import HW6.animals.Cat;
import HW6.animals.Dog;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat("Vaska"),
                new Dog("Bobik"),
                new Cat("Lion", 500,100),
                new Dog("Wolf", 3000,200)
        };


        for (int i = 0; i < animals.length; i++) {
            animals[i].run(60);
            animals[i].swim(4);
        }

        System.out.println(Animals.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
