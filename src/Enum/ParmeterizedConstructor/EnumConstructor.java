package Enum.ParmeterizedConstructor;

public class EnumConstructor {
    //enum constant declare with additional values
    enum Color {
        RED("Red Color"), BLUE("Blue Color"), GREEN("Green Color");

        private String description;

        // parameterized constructor
        Color(String description) {
            this.description = description;
        }
        // this method allow us the access the description
        // of each enum constant
        public String getDescription() {
            return description;
        }

    }

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color.getDescription());

    }
}
