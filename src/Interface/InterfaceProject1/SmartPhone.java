package Interface.InterfaceProject1;

public abstract class SmartPhone implements Camera,MusicPlayer,Telephone,Calculator,ComputerSystem {

    public void powerOn(){
        System.out.println("It is On");
    }
    public void powerOff(){
        System.out.println("OFF");
    }

    public abstract void takePicture();

}
