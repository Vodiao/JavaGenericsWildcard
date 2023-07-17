package Task1;

import Task1.Animal;

public class Cat extends Animal {

    private boolean isStray;


    public Cat(String name, int age, boolean isStray) {
        super(name, age);
        this.isStray = isStray;
    }

//    public boolean isStray() {
//        return isStray;
//    }

    @Override
    public String getAdditionalInfo() {
        return "Is Stray: " + isStray;
    }


}
