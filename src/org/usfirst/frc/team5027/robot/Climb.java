package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;

public class Climb {
	private Spark climb;
	
	public Climb (Spark climbing) {
		climb = climbing;
	}
	public void move(Joystick joy) {
		if (joy.getRawButton(2)) {
			climb.set(-1);
		}
		else { climb.set(0);}
	}
}
