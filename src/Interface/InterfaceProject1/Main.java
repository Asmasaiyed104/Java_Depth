package Interface.InterfaceProject1;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.browsInternet();
        iphone.makeCall();
        iphone.playMusic();
        iphone.stopMusic();
        iphone.receiveCallSomeone();
        iphone.takePicture();
        iphone.powerOff();

    }
}