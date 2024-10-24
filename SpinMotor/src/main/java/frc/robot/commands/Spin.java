// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.JoystickConstants;
import frc.robot.Constants.MotorConstants;
import frc.robot.subsystems.Motor;

public class Spin extends Command {
  /** Creates a new Spin. */
  private Motor m_motor;
  private Joystick m_joystick;


  public Spin(Motor motor, Joystick joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_motor = motor;
    m_joystick = joystick;

    addRequirements(motor); // we NEED the motor so we include this line to show that we really really need
    // the motor and nothing can else can be taking the motor once we have the motor 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_motor.setSpeed(0); // good practice
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // set speed equal to [joystick pos]*throttle
    m_motor.setSpeed(m_joystick.getRawAxis(JoystickConstants.kJoystickAxis)*MotorConstants.kSpeedMultiplier);
    // set speed
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_motor.setSpeed(0); // good practice
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
