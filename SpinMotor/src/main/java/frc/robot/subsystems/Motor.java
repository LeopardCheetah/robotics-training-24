// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  private final CANSparkMax m_motor = new CANSparkMax(MotorConstants.kMotorID, MotorType.kBrushless);

  public Motor() {} // do nothing lol

  public void setSpeed(double speed){
    m_motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
