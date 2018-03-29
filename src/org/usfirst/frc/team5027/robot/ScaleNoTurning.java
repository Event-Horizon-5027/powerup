package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class ScaleNoTurning {
	private Timer time;
	private DifferentialDrive drive;
	
	public ScaleNoTurning (Timer timey, DifferentialDrive driver) {
		drive = driver;
		time = timey;
	}
	public void move() {
		if(time.get()<5) {
			drive.arcadeDrive(0.7,0);
		}
		else {drive.arcadeDrive(0,0);}
	}
}
