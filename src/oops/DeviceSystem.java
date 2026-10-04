package oops;

public class DeviceSystem {
    public static void main(String[] args){
        Camera c1 = new SmartPhonee();
        c1.takePhoto();
        MusicPlayer[] players = {
             new SmartPhonee(),
             new SmartWatch()
        };
        for (MusicPlayer m : players){
            m.PlayMusic();
        }
    }
}
interface Camera {
    void takePhoto();
}
interface MusicPlayer {
    void PlayMusic();
}
class SmartPhonee implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking photo with Camera ");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Playing Music on SmartPhone");
    }
}
class SmartWatch implements MusicPlayer{
    @Override
    public void PlayMusic() {
        System.out.println("Playing Music on SmartWatch");
    }
}