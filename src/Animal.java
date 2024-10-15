class Animal {
    String animalName;

    Animal(String name) {
        this.animalName = name;
    }

    void animalSound() {
        System.out.println("Default animal sound");
    }
}

class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void animalSound() {
        System.out.println("Roaring!");
    }
}

class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    @Override
    void animalSound() {
        System.out.println("Mooing!");
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Lion lion = new Lion("Leo");
        Cow cow = new Cow("Daisy");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}