package Questions.smarthome.security;
import Questions.smarthome.control.RemoteAccess;

public class CCTVcamera extends SecurityDevice implements RemoteAccess{
    boolean recording;
    public CCTVcamera(String id, String name, boolean st, boolean r){
        super(id,name,st);
        recording=r;
    }
    public void recordVideo(int duration){
        System.out.println("Recording for "+duration+" seconds");
    }
    @Override
    public void activateSecurityMode(){
        turnOn();
        recording =true;
        System.out.println("CCTV activated. Recording Started.");
    }
    public void remoteTurnOff(){
        turnOff();
    }
    public void remoteTurnOn(){
        turnOn();
    }
}
