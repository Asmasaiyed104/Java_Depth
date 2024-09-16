package Association.OneToMany;

public class Teacher {
    String name;
    String id;
    Students[]std;

    public Teacher(String name, String id, Students[] std) {
        this.name = name;
        this.id = id;
        this.std = std;
    }
    public void showTheDetails(){
        System.out.println("Teachers name : " + name);
        System.out.println("Teachers ID : " + id);
        System.out.println("Teachers students : " );
        for (int i = 0; i<std.length;i++){
            System.out.println("Student ID : " + std[i].studentId + "  Courses : " +std[i].course );

        }
        System.out.println("-------------------------------------------------------------");
    }
}
