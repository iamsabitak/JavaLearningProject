package Day36;

public class Problem6 {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone(); //-- Calls everything in the class
        ms.record4KVideo(); //-- Default call
        // ms.greet(); --> Throws an error!
        ms.takeSnap();
        ms.recordVideo();

        // Object for Class MyCellphone
        MyCellphone mb = new MySmartphone();
        mb.callNumber(556);
        mb.pickCall();

        // WifiInterface my = new WifiInterface(); --> Throws an error!
        WifiInterface my = new MySmartphone(); //-- Calls only methods from WifiInterface
        my.connectToNetwork("Sabita5G");
        String[] ar = my.getNetworks(); 
        for (String item : ar) {
            System.out.println(item);
        }

        // my.takeSnap(); --> Throws an error because the object is only for WifiInterface
        // CameraInterface mm = new CameraInterface(); --> Not allowed
        CameraInterface mm = new MySmartphone(); // Calls only methods from CameraInterface
        mm.takeSnap();
        mm.recordVideo();
    }
}

interface CameraInterface {
    void takeSnap();
    void recordVideo();
    private void greet() {
        System.out.println("Good Morning greet()");
    }
    default void record4KVideo() {
        greet();
        System.out.println("record4KVideo() Recording in 4k...");
    }
}

interface WifiInterface {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellphone {
    void callNumber(int phoneNumber) {
        System.out.println("from CLASS callNumber() Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("from CLASS pickCall() Connecting...");
    }
}

class MySmartphone extends MyCellphone implements WifiInterface, CameraInterface {
    public void takeSnap() {
        System.out.println("Taking snap FROM takeSnap()");
    }
    public void recordVideo() {
        System.out.println("Taking snap FROM recordVideo()");
    }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks from getNetworks()");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("FROM connectToNetwork() Connecting to " + network);
    }
}
