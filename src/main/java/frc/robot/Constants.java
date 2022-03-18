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
    public static final int RIGHT_DRIVE_1 = 1;
    public static final int RIGHT_DRIVE_2 = 2;
    public static final int LEFT_DRIVE_1 = 3;
    public static final int LEFT_DRIVE_2 = 4;
    public static final int INTAKE_MOTOR = 5;
    public static final int FEEDER_MOTOR = 6;

    public static final int SHOOTER_MOTOR = 7;

    public static final int AIM_MOTOR = 9;
    public static final int WINCH_MOTOR = 8;

    // Sadness ):
    public static final double FEEDER_INVERT = -1; // 1 or -1

    // Piston.
    public static final int LIFT_PISTON = 15;//15;

    //Encoders.
    public static final int ARDUINO_SERIAL_SPEED = 9600;
    public static final int R_DRIVE_ENCODER_A = 0; // Encoders use 2 ports.
    public static final int R_DRIVE_ENCODER_B = 0;
    public static final int L_DRIVE_ENCODER_A = 0;
    public static final int L_DRIVE_ENCODER_B = 0;
    public static final int ARDUINO_MSG_LEN = 15;

    // Wheel and gears.
    public static final double DRIVE_ENCODER_DIS_PER_PULSE = 0;

    // Speed.
    public static final double DRIVE_SPEED = 0.6;
    public static final double INTAKE_SPEED = 0.5;
    public static final double FEEDER_SPEED = 1.0;
    public static final double WINCH_SPEED = 1.0;//Just a place holder and test later.

    public static final double STOP_SHOOTER = 0;
    public static final double START_SHOOTER = 1.0;

    public static final double AIM_SPEED = 0.2;
    public static final double AIM_SLOW_SPEED = 0.14;
    public static final double AIM_STOP = 0;
    public static final double AUTO_TURN_SPEED = 0.15;

    public static final double MULTIPLIER = 0;

    // Limits.
    public static final double MAX_DRIVE_ACCE = 0.1;

    public static final int MAX_AIM_CL = -15200;
    public static final int MAX_AIM_CO = 12000;

    // Autonmous.
    public static final double CLOCK_WISE = 1;
    public static final double COUNTER_CLOCK_WISE = -1;
    public static final double TURN_MIN = 1.0;


    // Navx.
    public static final byte NAVX_UPDATE_RATE = (byte)200; // 4 to 200.

    // Turning.
    public static final double TURN_RAD = 0.4;
    public static final double LOW_TURN_THRESHHOLD = 0.3;
    public static final double LOW_TURN_MULTIPLIER = 2.0; // Don't make this value 0!

    //Limelight Dist
    public static final double LIME_DEGREES = 20.0;

    public static final double LIME_LENS_HEIGHT = 37.0; //in inches

    public static final double GOAL_HEIGHT = 104.0; //in inches

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

    public static final int FLIGHT_BUTTON_7 = 7;
    public static final int FLIGHT_BUTTON_8 = 8;
    public static final int FLIGHT_BUTTON_9 = 9;
    public static final int FLIGHT_BUTTON_10 = 10;
    public static final int FLIGHT_BUTTON_11 = 11;
    public static final int FLIGHT_BUTTON_12 = 12;
}
