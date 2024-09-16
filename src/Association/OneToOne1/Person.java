package Association.OneToOne1;

public class Person {
    String personId;
    String personName;
    Passport pass1;

    public Person(String personId, String personName, Passport pass1) {
        this.personId = personId;
        this.personName = personName;
        this.pass1 = pass1;
    }

    void showPassportDetails(){
        System.out.println("My Id is "+ personId + " and My Name is "+ personName +", My Passport Origin Country is " + pass1.passportCountry+". My passport Number is " + pass1.passportNumber +".");
    }
}
