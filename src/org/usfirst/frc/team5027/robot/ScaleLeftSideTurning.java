package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class ScaleLeftSideTurning {
	private Timer time;
	private DifferentialDrive drive;
	
	public ScaleLeftSideTurning (Timer timey, DifferentialDrive driver) {
		drive = driver;
		time = timey;
	}
	public void move() {
		if(time.get()<4.3) {
			drive.arcadeDrive(0.7,0);
		}
		else if(time.get()>4.3&&time.get()<4.8) {
			drive.arcadeDrive(0, .6);
		}
		else if(time.get()>4.8&&time.get()<6.3) {
			drive.arcadeDrive(0.5,0);
		}
		else {drive.arcadeDrive(0,0);}
	}
}
