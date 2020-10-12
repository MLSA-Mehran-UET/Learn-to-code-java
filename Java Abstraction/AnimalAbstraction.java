import java.util.ArrayList;
import java.util.List;

public class AnimalAbstraction {

    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Snake());
        zoo.add(new Elephant());
        zoo.add(new Lion());
        zoo.add(new Bear());

        System.out.println("Welcome to the Zoo where you can hear all the animals");
        for (Animal animal:zoo) {
            animal.makeNoise();
            animal.sleep();
        }
    }
}

abstract class Animal {
    public abstract void makeNoise();
    public void sleep() {
        System.out.println("Zzzzz");
    }
}

class Snake extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Snake says Hissssssss");
    }
}

class Elephant extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Elephant says Pawoo");
    }
}

class Lion extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Lion says Roarrr");
    }
}

class Bear extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bear says Growl");
    }
}