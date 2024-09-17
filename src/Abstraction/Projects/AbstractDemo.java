package Abstraction.Projects;

abstract class Vehicle1
{
    abstract void start();
}
class Car extends Vehicle1
{
    void start()
    {
        System.out.println("starts with key");
    }
}
class Scooter extends Vehicle1
{
    void start()
    {
        System.out.println("starts with kick");
    }
}
class AbstractDemo
{
    public static void main(String[] args)
    {
        Car ob=new Car();
        ob.start();

        System.out.println("---------------------");

        Scooter ob2=new Scooter();
        ob2.start();
    }
}