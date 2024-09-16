package Association.OneToMany;

public class OneToMany {
    public static void main(String[] args) {

        Students s1 = new Students("123","Java","brampton");
        Students s2 = new Students("223","Python","mississauga");
        Students s3 = new Students("323","HTML","milton");

        Students[] students = {s1,s2,s3};
        Teacher t1 = new Teacher("Asma","12",students);
        t1.showTheDetails();



    }
}
