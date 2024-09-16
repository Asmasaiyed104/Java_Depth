package Polymorphism.OverloadingProjects;

public class BoxOverloadingConstructor {

    double width;
    double height;
    double depth;

    public BoxOverloadingConstructor(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

    }
    public BoxOverloadingConstructor() {
        width =  -1;
        height = -1;
        depth = -1;

    }

    public BoxOverloadingConstructor(double len){
        width = height =depth=len;
    }
    public double volume(){
        return width * height * depth;
    }
    public static void main(String[] args) {



        BoxOverloadingConstructor oc = new BoxOverloadingConstructor(10,20,28);
        BoxOverloadingConstructor oc1 = new BoxOverloadingConstructor(23);
        BoxOverloadingConstructor oc2 = new BoxOverloadingConstructor();
        double vol;
        vol = oc.volume();
        System.out.println("vol-1 : " + vol);
        vol = oc1.volume();
        System.out.println("vol-2 : " + vol);
        oc2.volume();
        System.out.println("vol-3 : " + vol);

    }
}
