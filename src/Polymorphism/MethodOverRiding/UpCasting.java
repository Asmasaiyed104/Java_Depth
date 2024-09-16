package Polymorphism.MethodOverRiding;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class  UpCasting {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting Dog to Animal
        animal.sound();  // Calls Dog's overridden sound method
    }
}


