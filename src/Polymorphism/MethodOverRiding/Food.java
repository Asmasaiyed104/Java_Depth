package Polymorphism.MethodOverRiding;
class VegFood extends Food{
    @Override
    void eat(){
        System.out.println("I am kind of Food for Vegetables");
    }

}
class NonVegFood extends VegFood{

    @Override
    void  eat(){
        System.out.println("I am kind of Food for NonVegearian");
    }
}

public class Food {
    void eat(){
        System.out.println("love to eat Anykind of food");
    }

    public static void main(String[] args) {

        NonVegFood nonVegFood = new NonVegFood();
        nonVegFood.eat();

        Food food = new Food();
        food.eat();

        VegFood vegFood = new VegFood();
        vegFood.eat();

    }

}
