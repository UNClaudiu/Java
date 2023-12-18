package Lab6;

public class Animal {
    public void eat() {
        System.out.println("This animal eats something.");
    }

    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

// Subclasses
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther eats meat and small mammals.");
    }

    @Override
    public void sound() {
        System.out.println("The panther hisses.");
    }

}

// Main class
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther.eat();
        panther.sound();
    }
}

