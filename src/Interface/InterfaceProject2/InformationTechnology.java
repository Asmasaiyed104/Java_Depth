package Interface.InterfaceProject2;

public class InformationTechnology  {
    String code = "1111111";

    void takeCourse(){
        System.out.println("Bright future");
    }

    public static void main(String[] args) {
        System.out.println();
        InformationTechnology informationTechnology = new InformationTechnology();
        informationTechnology.takeCourse();

      Javaimpl javaimpl = new Javaimpl();
      javaimpl.crazyJavaCode();

      BridgeImple bridgeImple = new BridgeImple();
      bridgeImple.runAwsConsole();
      bridgeImple.runCLI();

    }
}
