package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;

public class SwitchRightSideTurning {
	private Timer time;
	private DifferentialDrive drive;
	private Talon intake1;
	private Talon intake2;
	private Spark elevator;
	
	public SwitchRightSideTurning (Timer timey, DifferentialDrive driver, Talon intakeone, Talon intaketwo, Spark elev) {
		drive = driver;
		time = timey;
		intake1 = intakeone;
		intake2 = intaketwo;
		elevator = elev;
	}
	public void move() {
		if(time.get()<2.6) {
			drive.arcadeDrive(0.7,0);
			}
			else if(time.get()>2.6&&time.get()<3.2) {
				intake1.set(1);
				intake2.set(-1);
			}
			else if(time.get()>3.2&&time.get()<3.3) {
				intake1.set(0);
				intake2.set(0);
			}
			else if(time.get()>3.3&&time.get()<4.8) {
				elevator.set(-1);	
			}
			else if(time.get()>4.8&&time.get()<4.9) {
				elevator.set(0);
			}
			else if(time.get()>4.9&&time.get()<6.1) {
				drive.arcadeDrive(0, -.8);
			}
			else if(time.get()>6.1&&time.get()<6.4) {
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
			else if(time.get()>7.2&&time.get()<7.7) {
				drive.arcadeDrive(-0.7, 0);
			}
			else {
				drive.arcadeDrive(0,0);
				}
			}
}
