package Association.OneToOne;

public class OneToOne {
    public static void main(String[] args) {
        Address ad1 = new Address("Donlamont","toronto","Ontario");
        Employee emp1 = new Employee("101","Asma",ad1);
        emp1.showEmpDetails();

        System.out.println("-------------------------------------");


        Address ad2 = new Address("GoldenSpring","gta","ontario");
        Employee emp2 = new Employee("102","Rukshi",ad2);
        emp2.showEmpDetails();

        System.out.println("-------------------------------------");

        Address ad3 = new Address("circus","brampton","ontario");
        Employee emp3 = new Employee("103", "albar",ad3);
        emp3.showEmpDetails();
    }
}
