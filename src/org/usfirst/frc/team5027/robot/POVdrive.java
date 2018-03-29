package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class POVdrive {
	private DifferentialDrive drive;
	
	public POVdrive (DifferentialDrive drivers) {
		drive = drivers;
	}
	public void move(Joystick joy) {
		
		if (joy.getPOV()==0) {
			drive.arcadeDrive(1,0);
		}
		else if (joy.getPOV()==180) {
			drive.arcadeDrive(-1, 0);
			
		}
		else if (joy.getPOV()==90) {
			drive.arcadeDrive(0, 1);
		}
		else if (joy.getPOV()==270) {
			drive.arcadeDrive(0, -1);
		}
		else { drive.arcadeDrive(0, 0);
	}
}
}
