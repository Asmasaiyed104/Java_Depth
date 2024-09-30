package Polymorphism.MethodOverRiding;
class FaceCare extends MakeUp{
    @Override
    void apply(){
        System.out.println("beautiful face");
    }
}
class SkinCare extends MakeUp{
    @Override
    void apply(){
        System.out.println("beautiful skin");
    }
}
class LipCare extends FaceCare{
    @Override
    void apply(){
        System.out.println("beautiful lip");
    }
    void applyLipGlow(){
        System.out.println("like light shade glows");
    }
}
public class MakeUp {
    void apply(){
        System.out.println("I love makeup");
    }
    public static void main(String[] args) {

        MakeUp makeUp = new MakeUp();
        makeUp.apply();

        FaceCare faceCare = new FaceCare();
        faceCare.apply();

        SkinCare skinCare = new SkinCare();
        skinCare.apply();

        LipCare lipCare = new LipCare();
        lipCare.apply();

    }
}
