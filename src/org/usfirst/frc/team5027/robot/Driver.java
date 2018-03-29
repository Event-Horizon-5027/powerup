package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.drive.*;

import edu.wpi.first.wpilibj.*;

public class Driver {
	
	private DifferentialDrive drive;
	
	public Driver (DifferentialDrive driver) {
		drive = driver;
		
	}	
	public void move(Joystick joy) {
		drive.arcadeDrive(-.85*joy.getRawAxis(1), .85*joy.getRawAxis(2));
	}
}
