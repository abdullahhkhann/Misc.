
public class Main {

	public static void main(String[] args) {
		LightsControllerFacade lightController = new LightsControllerFacade();
		
		lightController.controlLights();

	}
}

class LightsControllerFacade {
	LightSensor lightSensor = new LightSensor("Dark");
	LightSwitch lightSwitch = new LightSwitch();
	
	public void controlLights () {
		if (lightSensor.isDark()) {
			lightSwitch.turnOn();
		}
		else if (lightSensor.isLight()) {
			lightSwitch.turnOff();
		}
	}
	
}

class LightSensor {
	private String atmosphere;

	public LightSensor(String atmosphere) {
		this.atmosphere = atmosphere;
	}
	
	public boolean isDark() {
		if (atmosphere == "Dark") {
			return true;
		}
		return false;
	}
	
	public boolean isLight() {
		if (atmosphere == "Light") {
			return true;
		}
		return false;
	}
}

class LightSwitch {
	public void turnOn() {
		System.out.println("Lights are on!!");
	}
	public void turnOff() {
		System.out.println("Lights are off!!");
	}
}
