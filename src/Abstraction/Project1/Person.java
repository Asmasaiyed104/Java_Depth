package Abstraction.Project1;

public abstract class Person {
   abstract void earn();

   public void eat(){
       System.out.println("food");
   }
   public  void love(){
       System.out.println("persons love family");
   }
    public static void main(String[] args) {

  PersonWife personWife = new PersonWife();
  personWife.earn();
  PersonImpl personImpl = new PersonImpl();
  personImpl.earn();

    }
}
