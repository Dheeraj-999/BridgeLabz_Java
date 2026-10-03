/*
 * Sample Problem 2: Smart Home Devices
 */

class Devices {
    int Deviceid;
    String status;

    Devices(int Deviceid, String status) {
        this.Deviceid = Deviceid;
        this.status = status;
    }
}

class Thermostat extends Devices {
    String temperatureSetting;

    Thermostat(int Deviceid, String status, String temeratureSetting) {
        super(Deviceid, status);
        this.temperatureSetting = temeratureSetting;
    }

    void displayStatus() {

        System.out.println("The device id: " + super.Deviceid);
        System.out.println("status : " + super.status);
        System.out.println("temperatureSetting : " + this.temperatureSetting);

    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat temp1 = new Thermostat(101, "ON", "25 deg celcius");

        temp1.displayStatus();
    }
}