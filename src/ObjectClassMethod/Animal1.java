package ObjectClassMethod;

public class Animal1 {
    int age = 3;
    String color;
    String breed;

    public Animal1(int age1, String color1, String breed1) {
        age = age1;
        color = color1;
        breed = breed1;
    }

    void eat(){
        System.out.println("Eating");
    }


        public static void main (String[]args){

            Animal1 buzo = new Animal1(2, "red", "canadian");
            System.out.println("It has an age : " + buzo.age + "   color : " + buzo.color + "  breed is " + buzo.breed);
            buzo.eat();


    }
}

