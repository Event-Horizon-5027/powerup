package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.*;

public class Elevator {
	private Spark elevator;
	private	DigitalInput limit1;
	private	DigitalInput limit2;
	
	public Elevator (Spark elev, DigitalInput limitone, DigitalInput limittwo) {
		elevator = elev;
		limit1 = limitone;
		limit2 = limittwo;
	}
	public void move(Joystick joy) {
		
		if (joy.getRawButton(6)) {
			if (limit1.get()==false&&limit2.get()==true) {
				elevator.set(-1);
		}	
			else if (limit1.get()==false&&limit2.get()==false) {
				elevator.set(-1);
			}
			else if(limit2.get()==false&&limit1.get()==true) {
				elevator.set(0);
		}
		}
		else if (joy.getRawButton(5)) {
			if (limit1.get()==true&&limit2.get()==false) {
				elevator.set(0.7);
			}
			else if (limit1.get()==false&&limit2.get()==false) {
				elevator.set(0.7);
			}
			else if (limit1.get()==false&&limit2.get()==true) {
				elevator.set(0);
			}
		}
		else {elevator.set(0);
		}
	}
		
		
}
