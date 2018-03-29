package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class MiddleStartTurnRight {
	private Timer time;
	private DifferentialDrive drive;
	private Talon intake1;
	private Talon intake2;
	private Spark elevator;
	
	public MiddleStartTurnRight (Timer timey, DifferentialDrive driver, Talon intakeone, Talon intaketwo, Spark elev) {
		drive = driver;
		time = timey;
		intake1 = intakeone;
		intake2 = intaketwo;
		elevator = elev;
	}
	public void move() {
		if(time.get()<1) {
			drive.arcadeDrive(0.7, 0);
		}
		else if(time.get()>1&&time.get()<1.3) {
			drive.arcadeDrive(0, 0.7);
		}
		else if(time.get()>1.3&&time.get()<2) {
			drive.arcadeDrive(0.7, 0);
		}
		else if(time.get()>2&&time.get()<3) {
			intake1.set(1);
			intake2.set(-1);
		}
		else if(time.get()>3&&time.get()<3.1) {
			intake1.set(0);
			intake2.set(0);
		}
		else if(time.get()>3.1&&time.get()<4.6) {
			elevator.set(-1);
		}
		else if(time.get()>4.6&&time.get()<4.7) {
			elevator.set(0);
		}
		else if(time.get()>4.7&&time.get()<5.4) {
			intake1.set(-1);
			intake2.set(1);
		}
		else if(time.get()>5.4&&time.get()<5.5) {
			intake1.set(0);
			intake2.set(0);
		}
		else if(time.get()>5.5&&time.get()<5.8) {
			drive.arcadeDrive(-0.7, 0);
		}
		else {drive.arcadeDrive(0,0);}
	}
}
