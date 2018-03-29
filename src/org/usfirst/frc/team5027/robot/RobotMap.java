package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	
	public static final Spark topl = new Spark(1);
	
	public static final Spark botl = new Spark(2);
	
	public static final Spark topr = new Spark(3);
	
	public static final Spark botr = new Spark(0);
	
	public static final Spark elevator = new Spark(5);
	
	public static final Talon intake1 = new Talon(7);
	
	public static final Talon intake2 = new Talon(8);
	
	public static final Joystick joy = new Joystick(0);
	
	public static final DigitalInput limit1 = new DigitalInput(1);
	
	public static final DigitalInput limit0 = new DigitalInput(0);
	
	public static final Spark climb = new Spark(4);
	
	public static final Servo actuator = new Servo(9);
	
	public static final SpeedControllerGroup left = new SpeedControllerGroup(topl, botl);
	public static final SpeedControllerGroup right = new SpeedControllerGroup(topr, botr);
	public static final DifferentialDrive drive = new DifferentialDrive(left, right);
}
