package Interface.InterfaceProject1;
public class Iphone extends SmartPhone{
    public void takePicture(){
        System.out.println("Good quality image");
    }
    public void playMusic(){
        System.out.println("playing Music");
    }
    public void stopMusic(){
        System.out.println("Stopping music");
    }
    public void makeCall(){
        System.out.println("Calling someone");

    }
    public  void receiveCallSomeone(){
        System.out.println("recieving call");
    }
    public int add(int a , int b){
        return  a + b;
    }
    public void browsInternet(){
        System.out.println("Browsing");
    }
}
