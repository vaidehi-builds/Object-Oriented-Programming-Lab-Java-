package Questions.smarthome.security;

public class MotionSensor extends SecurityDevice{
    public MotionSensor(String id, String n, boolean s){
        super(id,n,s);
    }
    public void detectMotion(){

    }
    @Override
    public void activateSecurityMode(){
        turnOn();
        System.out.println("Motion Sensor activated. Monitoring for movement.");
    }
    public class BatteryStatus{
        int batteryLevel;
        int getBatteryLevel(){
            return batteryLevel;
        }
    }
}
