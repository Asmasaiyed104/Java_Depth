package Java8Features.LambdaExpression;
@FunctionalInterface
interface ITest{
    boolean tName(String name);
}
public class DriveTest {

    public void issueDl(String name,ITest test){
        if(test.tName(name)){
            System.out.println("Driving Licenece issued to " + name);
        }else {
            System.out.println("Driving license not issued to " + name);
        }

    }

    public static void main(String[] args) {
        ITest nTest =(String name)->name.length() >= 4;
        DriveTest driveTest = new DriveTest();
        driveTest.issueDl("Asma",nTest);
        driveTest.issueDl("Ashwini",nTest);
        driveTest.issueDl("Meet",nTest);
        driveTest.issueDl("a",nTest);


    }
}
