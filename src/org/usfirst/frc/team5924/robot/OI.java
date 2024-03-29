/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5924.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	
	public static Joystick xboxJoy = new Joystick(RobotConstants.cXboxJoy);
	public static Joystick buttonPanel = new Joystick(RobotConstants.cButtonPanel);
	
	public boolean getGroundPosButton(){
		
		return buttonPanel.getRawButton(RobotConstants.groundPosButton);
		
	}
	
	public boolean getExchangePosButton(){
		
		return buttonPanel.getRawButton(RobotConstants.exchangePosButton);
		
	}
	
	public boolean getSwitchPosButton(){
		
		return buttonPanel.getRawButton(RobotConstants.switchPosButton);
		
	}
	
	public boolean getStartPosButton(){
		
		return buttonPanel.getRawButton(RobotConstants.startPosButton);
		
	}
	
	public boolean getIntakeButton(){
		
		
		return buttonPanel.getRawButtonPressed(RobotConstants.intakeCubeButton);
		
	}
	
	public boolean getOuttakeButton(){
		
		
		return buttonPanel.getRawButtonPressed(RobotConstants.outtakeCubeButton);
		
	}
	
	public boolean toggleCubeState(){
		
		return buttonPanel.getRawButtonPressed(RobotConstants.switchCubeState);
	}
	
	public boolean getBFRampDownButton(){
		
		return buttonPanel.getRawButton(RobotConstants.bFRampDownButton);
		
	}
	
	public boolean getBRampVerticalButton(){
		
		return buttonPanel.getRawButton(RobotConstants.bRampVerticalButton);
		
	}
	public boolean toggleControlMode(){
		
		return buttonPanel.getRawButtonPressed(RobotConstants.switchControlMode);
		
	}
	
	public double getXboxYAxis(){
		
		return xboxJoy.getRawAxis(RobotConstants.cXboxJoyYAxis);
		
	}
	
	public double getXboxXAxis(){
		
		return xboxJoy.getRawAxis(RobotConstants.cXboxJoyXAxis);
		
	}
	
	public double getButtonPanelAxis(){
		
		return buttonPanel.getRawAxis(RobotConstants.cButtonPanelAxis);
		
	}
}
