package org.usfirst.frc.team5924.robot.commands;

import org.usfirst.frc.team5924.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeCommand extends Command {

    public CubeCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.kCubeManipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	//Robot.kCubeManipulator.printCubeManipulatorStatus();
    	//Robot.kCubeManipulator.checkButtonToggle();
		// CUBE MANIPULATOR
    	/*
		if(Robot.oi.getIntakeButton()){
			Robot.kCubeManipulator.intakeCube();
			
		} else if (Robot.oi.getOuttakeButton()){
			Robot.kCubeManipulator.outtakeCube();

		}
		
		Robot.kCubeManipulator.runCubeMotor();
		Robot.kCubeManipulator.printCubeManipulatorStatus();
		*/
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
