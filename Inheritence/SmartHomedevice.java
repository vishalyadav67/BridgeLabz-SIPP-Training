class Device{
	String  deviceID;
	String Status;
	
	Device(String deviceID,  String Status){
		this.deviceID=deviceID;
		this.Status= Status;
	}
	void displaydetails() {
		System.out.println("device-ID " + deviceID);
		System.out.println("Status " + Status);
	}
}
class Thermostat extends Device{
	double TemperatureSetting;
	 Thermostat(String deviceId, String status, double TemperatureSetting) {
		 super(deviceId, status);
	        this.TemperatureSetting = TemperatureSetting;
	 }
	 void displaydetails() {
		 super.displaydetails();
		 System.out.println("Temperature Setting "+ TemperatureSetting);
	 }
}
public class SmartHomedevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermostat livingRoomThermostat = new Thermostat("T2111", "ON", 23.5);
        livingRoomThermostat.displaydetails();

	}

}
