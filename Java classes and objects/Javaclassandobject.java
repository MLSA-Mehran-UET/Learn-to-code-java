class Lamp {
    boolean isOn;

    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}


class Main {
    public static void main(String[] args) {
  
        // create objects l1 and l2
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
  
        // call methods turnOn() and turnOff()
        l1.turnOn();
        l2.turnOff();
    }