package Java8Features.LambdaExpression;


class Student {
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String firstName;
    private String lastName;
   private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}


@FunctionalInterface
interface IResult {
    String apply(Student student);
}

class NameMapper {
    public void map(Student student, IResult result) {
        String output = result.apply(student);
        System.out.println(output);
    }
}


 class Main {
    public static void main(String[] args) {

        Student student = new Student("Asma", "Saiyed", 25);
        NameMapper nameMapper = new NameMapper();
        nameMapper.map(student, (s) -> s.getFirstName()+ " " + s.getLastName());
    }
}
