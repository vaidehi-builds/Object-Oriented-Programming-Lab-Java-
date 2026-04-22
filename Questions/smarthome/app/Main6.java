package Questions.smarthome.app;
import Questions.smarthome.security.*;

public class Main6 {
    public static void main(String[] args){
        CCTVcamera cam=new CCTVcamera("C1","Camera",false,false);
        SmartLock sl=new SmartLock("S1","Lock",false,false);
        MotionSensor ms=new MotionSensor("M1","Sensor",false);

        cam.turnOn();
        cam.remoteTurnOn();
        cam.recordVideo(10);

        sl.lockDoor();
        sl.remoteTurnOff();

        ms.detectMotion();

        System.out.println("Total Devices: "+SecurityDevice.getDeviceCount());
    }
}
