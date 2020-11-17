package demo.testng;

public class Car {
	
	
	
	public String turn_on_headlights(String onOrOff) {
		
		if(onOrOff.equals("on")) {
			return "Headlights are on";
		}else {
			return "Headlights are off";
		}
	}
	
	
	public String turn_on_radio(String onOrOff) {
		
		if(onOrOff.equals("on")) {
			return "Radio is on";
		}else {
			return "Radio is off";
		}
	}

}
