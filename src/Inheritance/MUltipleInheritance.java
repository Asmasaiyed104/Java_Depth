package Inheritance;

public class MUltipleInheritance {
    public static void main(String[] args) {

    }
    class A implements I1{

    }
    class B extends A implements I2{

    }
    class C extends B implements I1,I2{

    }
    interface I1{
   // void show();
    }
    interface I2{

    }
}

// how we can achieve multiple / hybrid inheritance ?
//Ans: Interface


