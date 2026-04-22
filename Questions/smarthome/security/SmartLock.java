package Questions.smarthome.security;
import Questions.smarthome.control.*;
public class SmartLock extends SecurityDevice implements RemoteAccess{
    boolean locked;
    public SmartLock(String id, String na, boolean st, boolean l){
        super(id,na,st);
        locked=l;
    }
    public void lockDoor(){
        locked=true;
    }
    public void unlockDoor(){
        locked=false;
    }
    @Override
    public void activateSecurityMode(){
        turnOn();
        lockDoor();
        System.out.println("Smart Lock activated. Door Locked.");
    }
    public void remoteTurnOff(){
        status=false;
    }
    public void remoteTurnOn(){
        status=true;
    }
}
