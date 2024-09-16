package Association.OneToOne1;

public class OneToOne1 {
    public static void main(String[] args) {

        Passport p1 = new Passport("12345","Canada");
        Person per1 = new Person("1","Asma",p1);
        per1.showPassportDetails();

    }
}
