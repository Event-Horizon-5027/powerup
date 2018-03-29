package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;

public class Intake {
	private Talon intake1;
	private Talon intake2;
	private Timer time;
	
	public Intake (Talon intakeone, Talon intaketwo, Timer timey) {
		intake1 = intakeone;
		intake2 = intaketwo;
		time = timey;
	}
	
	public void move(Joystick joy) {
		
		if (joy.getRawButton(7)) {
			time.start();
			if(time.get()<1) {
				intake1.set(-1);
				intake2.set(1);
			}
		}
		else if (joy.getRawButton(8)) {
			time.start();
			if(time.get()<1) {
				intake1.set(1);
				intake2.set(-1);
			}
		}
		else if (joy.getRawButton(1)) {
			time.start();
			if(time.get()<1) {
				intake1.set(1);
				intake2.set(1);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0);
			}
		}
		else if (joy.getRawButton(3)) {
			time.start();
			if(time.get()<1) {
				intake1.set(1);
				intake2.set(1);
				time.delay(0.1);
				intake1.set(0);
				intake2.set(0);
				time.delay(0.2);
			}
		}
		else {
			intake1.set(0);
			intake2.set(0);
		}
	}
	
	
	
}
