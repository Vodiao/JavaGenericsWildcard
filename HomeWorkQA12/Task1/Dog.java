package Task1;

import Task1.Animal;

public class Dog extends Animal {


    private String breed;



    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

//    public String getBreed() {
//        return breed;
//    }

    @Override
    public String getAdditionalInfo() {
        return "Breed: " + breed;
    }





}
