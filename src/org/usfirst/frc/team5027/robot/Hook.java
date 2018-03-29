package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;

public class Hook {
	private Servo actuator;
	
	public Hook (Servo hooking) {
	actuator = hooking;
	}
	public void move(Joystick joy) {
		if (joy.getRawButton(10)) {
			actuator.setPosition(0.82);
		}
		else if (joy.getRawButton(9)) {
			actuator.setPosition(0.17);
		}
		else {
			
		}
	}
}
