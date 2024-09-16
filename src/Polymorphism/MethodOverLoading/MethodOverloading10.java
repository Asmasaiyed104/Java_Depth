package Polymorphism.MethodOverLoading;

public class MethodOverloading10 {

        public static void main(String[] args)
        {
            System.out.println("1");

            MethodOverloading10 ob=new MethodOverloading10();
            int[] arr={10,20};
            ob.main(arr);
        }
        public static void main(int[] args)
        {
            System.out.println("2");
        }
    }