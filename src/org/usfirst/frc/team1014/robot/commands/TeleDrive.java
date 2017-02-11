package org.usfirst.frc.team1014.robot.commands;

import org.usfirst.frc.team1014.robot.OI;
import org.usfirst.frc.team1014.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1014.robot.utils.Vector2d;

import edu.wpi.first.wpilibj.command.Command;

public class TeleDrive extends Command {
	
	protected void initialize()
	{
		requires(DriveTrain.getInstance());
	}

	public void execute() {
		DriveTrain.getInstance().drive(OI.xboxController0.getRightStickX(),
				new Vector2d(OI.xboxController0.getLeftStickX(), OI.xboxController0.getLeftStickY()));

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}