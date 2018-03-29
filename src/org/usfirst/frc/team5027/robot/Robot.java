package org.usfirst.frc.team5027.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends IterativeRobot {
	
	Timer time = new Timer();
	
	Intake shooter = new Intake(RobotMap.intake1, RobotMap.intake2, time);
	
	Elevator elevator = new Elevator(RobotMap.elevator, RobotMap.limit1, RobotMap.limit0);
	
	Driver driver = new Driver(RobotMap.drive);
	
	Hook hook = new Hook(RobotMap.actuator);
	
	String gamedata;
	
	String auto;
	String position = "r"; //"r" "l" m"	
	String Turn = "na"; //"left" "right" "no" "na"
	String Goal = "Switch"; // "scale" "switch" "na"
	
	MiddleStartTurnLeft MidLeft = new MiddleStartTurnLeft(time, RobotMap.drive, RobotMap.intake1, RobotMap.intake2, RobotMap.elevator);
	
	MiddleStartTurnRight MidRight = new MiddleStartTurnRight(time, RobotMap.drive, RobotMap.intake1, RobotMap.intake2, RobotMap.elevator); 
	
	ScaleLeftSideTurning ScaleLeft = new ScaleLeftSideTurning(time, RobotMap.drive);
	
	ScaleRightSideTurning ScaleRight= new ScaleRightSideTurning(time, RobotMap.drive);
	
	ScaleNoTurning ScaleStraight = new ScaleNoTurning(time, RobotMap.drive);
	
	SwitchLeftSideTurning SwitchLeft = new SwitchLeftSideTurning(time, RobotMap.drive, RobotMap.intake1, RobotMap.intake2, RobotMap.elevator);
	
	SwitchRightSideTurning SwitchRight = new SwitchRightSideTurning(time, RobotMap.drive, RobotMap.intake1, RobotMap.intake2, RobotMap.elevator);
	
	SwitchNoTurning SwitchStraight = new SwitchNoTurning(time, RobotMap.drive);
	
	//POVdrive POV = new POVdrive(RobotMap.drive);
	
	Climb climb = new Climb(RobotMap.climb);
	
	
	@Override
	public void robotInit() {
				
		CameraServer.getInstance().startAutomaticCapture(1); 
		CameraServer.getInstance().startAutomaticCapture(0);
		
	}

		@Override
	public void autonomousInit() {
			gamedata = DriverStation.getInstance().getGameSpecificMessage();
			
			if(gamedata.charAt(0)=='L'&& position == "m" && Turn =="left" && Goal == "na") {
				auto = "ML";
			}
			else if (gamedata.charAt(0)=='R'&& position =="m" && Turn == "right" && Goal == "na") {
				auto = "MR";
			}
			else if(gamedata.charAt(0)=='L'&& position == "l" && Turn == "na" && Goal == "Switch") {
				auto = "SWL";
			}
			else if(gamedata.charAt(0)=='R'&& position == "r" && Turn == "na" && Goal == "Switch") {
				auto = "SWR";
			}
			else if(gamedata.charAt(1)=='L'&& position == "l" && Turn == "na" && Goal == "Scale") {
				auto = "SCL";
			}
			else if(gamedata.charAt(1)=='R'&& position == "r" && Turn == "na" && Goal == "Scale") {
				auto = "SCR";
			}
			else if(gamedata.charAt(1)=='R'&& position == "r" && Turn == "no" && Goal == "Scale") {
				auto = "SCFR";
			}
			else if(gamedata.charAt(1)=='L'&& position == "l" && Turn == "no" && Goal == "Scale") {
				auto = "SCFL";
			}
			else if(gamedata.charAt(0)=='R'&& position == "r" && Turn == "no" && Goal == "Switch") {
				auto = "SWFR";
			}
			else if(gamedata.charAt(0)=='L'&& position == "l" && Turn == "no" && Goal == "Switch") {
				auto = "SWFL";
			}
			
	}

		@Override
	public void autonomousPeriodic() {
			time.start();
			while(isAutonomous()) {
				while (time.get()<14) {
					if(auto == "SWR") {
						SwitchRight.move();
						//System.out.println("m");
						//System.out.println(gamedata);
					}
					else if(auto == "SWL") {
						SwitchLeft.move();
						//System.out.println("n");
						//System.out.println(gamedata);
					}
					else if(auto == "SWFR") {
						ScaleStraight.move();
					}
					else if(auto == "SWFL") {
						ScaleStraight.move();
					}
					else {
						SwitchStraight.move();
						
					}
				
				/*if(gamedata.charAt(0)=='L'&& position == "m" && Turn =="left" && Goal == "na") {
					MidLeft.move();
				}
				else if (gamedata.charAt(0)=='R'&& position =="m" && Turn == "right" && Goal == "na") {
					MidRight.move();
				}
				else if(gamedata.charAt(0)=='L'&& position == "l" && Turn == "na" && Goal == "Switch") {
					SwitchLeft.move();
				}
				else if(gamedata.charAt(0)=='R'&& position == "r" && Turn == "na" && Goal == "Switch") {
					SwitchRight.move();
				}
				else if(gamedata.charAt(1)=='L'&& position == "l" && Turn == "na" && Goal == "Scale") {
					ScaleLeft.move();
				}
				else if(gamedata.charAt(1)=='R'&& position == "r" && Turn == "na" && Goal == "Scale") {
					ScaleRight.move();
				}
				else if(gamedata.charAt(1)=='R'&& position == "r" && Turn == "no" && Goal == "Scale") {
					ScaleStraight.move();
				}
				else if(gamedata.charAt(1)=='L'&& position == "l" && Turn == "no" && Goal == "Scale") {
					ScaleStraight.move();
				}
				else if(gamedata.charAt(0)=='R'&& position == "r" && Turn == "no" && Goal == "Switch") {
					SwitchStraight.move();
				}
				else if(gamedata.charAt(0)=='L'&& position == "l" && Turn == "no" && Goal == "Switch") {
					SwitchStraight.move();
				}*/
					
					
				}
			}
		}

	@Override
	public void teleopPeriodic() {
		
		driver.move(RobotMap.joy);
		
		shooter.move(RobotMap.joy);
		
		elevator.move(RobotMap.joy);
		
		hook.move(RobotMap.joy);
		
		//POV.move(RobotMap.joy);
		
		climb.move(RobotMap.joy);
		
		/*//
		if (joy.getPOV()==0) {
			elevator.set(0.8);
		}
		else if (joy.getPOV()==180) {
			elevator.set(-0.8);
		}
		else {
			elevator.set(0);
		}
		*/
		
		
		
		
		}
	@Override
	public void testPeriodic() {
	}
}
