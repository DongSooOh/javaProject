package interfaceExample3;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl.changeBattery();
	}
}
