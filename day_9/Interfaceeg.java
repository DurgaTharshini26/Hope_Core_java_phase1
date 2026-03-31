package day_9;


    /*

Interface = contract(can be implemented by any class, even if they are not related)
Class = implementation

*/

interface RemoteControl{
    void SwitchOn();
    void SwitchOff();
}

interface WifiControl{
    void ConnectWifi();
    void DisconnectWifi();
}

class TV implements RemoteControl, WifiControl{
    public void SwitchOn(){
        System.out.println("TV is switched on.");
    }
    public void SwitchOff(){
        System.out.println("TV is switched off.");
    }
    public void ConnectWifi(){
        System.out.println("TV is connected to wifi.");
    }
    public void DisconnectWifi(){
        System.out.println("TV is disconnected from wifi.");
    }
}

public class Interfaceeg{
    public static void main(String[] agrs){
        TV mytv=new TV();
        mytv.SwitchOn();
        mytv.ConnectWifi();
        RemoteControl rc=new TV(); // RemoteControl reference to TV object
        rc.SwitchOff(); // rc.ConnectWifi(); // Error: ConnectWifi() is not defined in RemoteControl interface  
    }
}

