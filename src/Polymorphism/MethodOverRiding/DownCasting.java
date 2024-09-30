package Polymorphism.MethodOverRiding;

class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

//public class DownCasting {
//    public static void main(String[] args) {
//     //   Animal1 animal = new Dog1();  // Upcasting Dog to Animal
//
//       // if (animal instanceof Dog1) {  // Check if the animal is actually a Dog
//         //   Dog1 dog = (Dog1) animal;   // Downcasting back to Dog
//            dog.bark();  // Now we can call Dog-specific method
//        } else {
//            System.out.println("The animal is not a Dog and cannot be downcasted.");
//        }
//    }
//}
