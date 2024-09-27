package Collection.ArrayList.Proj2.ArrayList_LiskedListPro1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CarLists {
    public static void main(String[] args) {
        //ArrayList of Car

        ArrayList<String> petrolCars = new ArrayList<>();
        petrolCars.add("BMW X6");
        petrolCars.add("Audi Q5");
        petrolCars.add("Mercedes");
        petrolCars.add("Toyota Land Cruiser");
        petrolCars.add("Honda Civic");

        //add petrol car at index 2
        petrolCars.add(2,"Ford");

        //remove one petrol car HondaCivic
        petrolCars.remove("Honda Civic");
        boolean BMWX6 = true;
        petrolCars.contains("BMW X6");
        System.out.println("It contain BMW X6" + BMWX6);
        System.out.println("---------------------------");

        //craete LinkedList
        LinkedList<String>electricCars = new LinkedList<>();

        electricCars.add("Tesla S");
        electricCars.add("Nisaan");
        electricCars.add("Chevrolet");
        electricCars.add("BMW i3");

        //craete AL of all cars
        ArrayList<String> allCars = new ArrayList<>();
        allCars.addAll(petrolCars);
        allCars.addAll(electricCars);

        //iterate usingloop
        System.out.println("All Cars   : ");{
            for (String car : allCars){
                System.out.println(car);
            }
            if (allCars.contains("BMW X6"));
            {
                allCars.remove("BMW X6");
                System.out.println("-----------------------------");
                System.out.println("BMW X6 is removed ");
            }
            // after removing update
            System.out.println("-----------------------------");
            System.out.println("Update LIst : " );
            for (String car : allCars){
                System.out.println(car);
            }
        }

    }
}
