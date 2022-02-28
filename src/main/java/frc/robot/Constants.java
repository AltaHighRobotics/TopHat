// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants { 
    // Motors.
    public static final int RIGHT_DRIVE_1 = 0;
    public static final int RIGHT_DRIVE_2 = 0;
    public static final int LEFT_DRIVE_1 = 0;
    public static final int LEFT_DRIVE_2 = 0;
    public static final int INTAKE_MOTOR = 0;
    public static final int FEEDER_MOTOR = 0;

    // Speed.
    public static final double DRIVE_SPEED = 0.5;
    public static final double INTAKE_SPEED = 0.25;
    public static final double INTAKE_SPEED_REV = 0.25;
    public static final double FEEDER_SPEED = 0.25;
    public static final double FEEDER_SPEED_REV = 0.25;

    // Navx.
    public static final byte NAVX_UPDATE_RATE = (byte)200; // 4 to 200.

    // Turning.
    public static final double TURN_RAD = 0.4;
    public static final double LOW_TURN_THRESHHOLD = 0.3;
    public static final double LOW_TURN_MULTIPLIER = 2.0; // Don't make this value 0!

    // Controller.
    public static final int DRIVER_CONTROLLER = 0;
    public static final int RIGHT_STICK_Y = 3; //5 for flight, 3 for cntroller
    public static final int RIGHT_STICK_X = 4;
    public static final int LEFT_STICK_Y = 1;
    public static final int LEFT_STICK_X = 0;
    public static final int STICK_Z = 2;

    public static final int XBOX_A_BUTTON = 1; 
    public static final int XBOX_B_BUTTON = 2;
    public static final int XBOX_X_BUTTON = 3;
    public static final int XBOX_Y_BUTTON = 4;
    public static final int WINCH_MOTOR = 0;
    public static final int LIFT_PISTON = 0;
    public static final double WINCH_SPEED = 0;
}
