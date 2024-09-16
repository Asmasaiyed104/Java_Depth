package SelectionStatements;

public class Switch {
    public static void main(String[] args) {

        int rollNo =103;
        // switch take the variable output either it is integer or string
        // first declare what data type you want to put in logic
        // use that data type into switch and also use that data
        // type into case
        // always put colon after case
        switch (rollNo){
            case 101:
                System.out.println("Amit");
                break;
            case  102:
                System.out.println("Asma");
                break;
            case 103:
                System.out.println("Deepu");
                //break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
