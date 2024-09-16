package Enum.Interface;

public enum Season implements Weather {
    WINTER,SUMMER;

    @Override
    public void forecast() {
        System.out.println("It's " + this + " season.");


    }
}

