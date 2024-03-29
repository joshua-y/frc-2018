package org.usfirst.frc.team5924.robot.commands;

import org.usfirst.frc.team5924.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTurnCommand extends Command { //FIX THIS
	
	private String turnType;
	
    public DriveTurnCommand(String turnReq) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.kRobotDrive);
    	turnType = turnReq;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.imu.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.kRobotDrive.printAutoMotorInfo();
    	Robot.kRobotDrive.turnRobot(turnType);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.kRobotDrive.checkTurn();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}