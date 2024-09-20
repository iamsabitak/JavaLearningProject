package Day12;

public class PracticeSet2 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // Create a CellPhone object
        CellPhone myObj = new CellPhone();
        myObj.ring();
        myObj.vibrating();
        myObj.callingFriend();
    }

}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrating() {
        System.out.println("Vibrating...");
    }

    public void callingFriend() {
        System.out.println("Calling friend...");
    }
}
