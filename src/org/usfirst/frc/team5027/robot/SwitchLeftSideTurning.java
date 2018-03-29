package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class SwitchLeftSideTurning {
	private Timer time;
	private DifferentialDrive drive;
	private Talon intake1;
	private Spark elevator;
	private Talon intake2; 
	
	public SwitchLeftSideTurning (Timer timey, DifferentialDrive driver, Talon intakeone, Talon intaketwo, Spark elev) {
		drive = driver;
		time = timey;
		intake1 = intakeone;
		intake2 = intaketwo;
		elevator= elev;
	}
	public void move() {
		if(time.get()<2.5) {
			drive.arcadeDrive(0.7,0);
			}
			else if(time.get()>2.5&&time.get()<3.1) {
				intake1.set(1);
				intake2.set(-1);
			}
			else if(time.get()>3.1&&time.get()<3.2) {
				intake1.set(0);
				intake2.set(0);
			}
			else if(time.get()>3.2&&time.get()<4.7) {
				elevator.set(-1);	
			}
			else if(time.get()>4.7&&time.get()<4.8) {
				elevator.set(0);
			}
			else if(time.get()>4.8&&time.get()<6.3) {
				drive.arcadeDrive(0, .8);
			}
			else if(time.get()>6.3&&time.get()<6.4) {
				drive.arcadeDrive(0.7,0);
			}
			else if(time.get()>6.4&&time.get()<7.1) {
				intake1.set(-1);
				intake2.set(1);
			}
			else if(time.get()>7.1&&time.get()<7.2) {
				intake1.set(0);
				intake2.set(0);
			}
			else if(time.get()>7.2&&time.get()<7.4) {
				drive.arcadeDrive(-0.7, 0);
			}
			else {
				drive.arcadeDrive(0,0);
				}
	}
	
}
