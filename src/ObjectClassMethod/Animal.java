package ObjectClassMethod;
/*
* if we have 1000 of objects only two three instance variable we will use
* 1000 lines code so for this reason , constructor came
* */

public class Animal {

    int age=3;
    String color;
    String breed;

    void eat(){
        System.out.println("eating");
    }
    void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Animal buzo = new Animal();
        System.out.println("Dog Object");
        buzo.age=3;
        System.out.println(buzo.age);
        buzo.color="red";
        System.out.println(buzo.color);
        buzo.eat();
        buzo.run();

        System.out.println("------------------------------");

        Animal cat = new Animal();
        System.out.println("Cat Object");
        cat.color="white";
        System.out.println(cat.color);
        cat.age=4;
        System.out.println(cat.age);
        cat.breed="American";
        System.out.println(cat.breed);
        cat.eat();
        cat.run();


    }

}
