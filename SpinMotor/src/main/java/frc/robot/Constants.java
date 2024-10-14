// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class MotorConstants {
    public static final int kMotorID = "fix this"; // to change once i get the right number
    public static final double kSpeedMultiplier = 0.05;
  }

  public static class JoystickConstants{
    public static final int kDriveJoystickId = 0; // use first port
    public static final int kJoystickAxis = ":C"; // setting to 0 is fine but check here 
  }
}
