package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class ScaleRightSideTurning {
	private Timer time;
	private DifferentialDrive drive;
	
	public ScaleRightSideTurning (Timer timey, DifferentialDrive driver) {
		drive = driver;
		time = timey;
	}
	public void move() {
		if(time.get()<5) {
			drive.arcadeDrive(0.7,0);
		}
		else if(time.get()>5&&time.get()<5.7) {
			drive.arcadeDrive(0, -.6);
		}
		else if(time.get()>5.7&&time.get()<6.3) {
			drive.arcadeDrive(0.5,0);
		}
		else {drive.arcadeDrive(0,0);}
	}
}
