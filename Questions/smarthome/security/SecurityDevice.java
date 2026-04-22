package Questions.smarthome.security;
public abstract class SecurityDevice {
    String deviceId;
    String deviceName;
    boolean status;
    static int deviceCount=0;
    public SecurityDevice(String did, String dn, boolean s){
        setDeviceId(did);;
        setDeviceName(dn);;
        status=s;
        deviceCount++;
    }
    public String getDeviceId(){
        return deviceId;
    }
    public String getDeviceName(){
        return deviceName;
    }
    public boolean getStatus(){
        return status;
    }
    private void setDeviceId(String id){
        deviceId=id;
    }
    private void setDeviceName(String n){
        deviceName=n;
    }
    public void turnOn(){
        status=true;
    }
    public void turnOff(){
        status=false;
    }
    public abstract void activateSecurityMode();
    public static int getDeviceCount(){
        return deviceCount;
    }
}


