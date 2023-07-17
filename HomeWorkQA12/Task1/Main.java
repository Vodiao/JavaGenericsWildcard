package Task1;

import Task1.Animal;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Cat> arrayCat = new ArrayList<>();
        arrayCat.add(new Cat("Knopa",2,true));
        arrayCat.add((new Cat("Buffi",3,true)));



        Set<Dog> arrayDog = new HashSet<>();
        arrayDog.add(new Dog("Bobrik",7,"labrador"));
        arrayDog.add((new Dog("Masik", 9,"doberman")));

        getCollection(arrayDog);
        getCollection(arrayCat);

    }

    public static void getCollection(Collection<? extends Animal> collection){
        for (Animal animal : collection) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println(animal.getAdditionalInfo());
            System.out.println();
        }
    }
}