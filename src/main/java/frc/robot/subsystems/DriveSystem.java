/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class DriveSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark LeftFrontMotor = new Spark(RobotMap.LeftFrontPort);
  public Spark LeftBackMotor = new Spark(RobotMap.LeftBackPort);
  public Spark RightFrontMotor = new Spark(RobotMap.RightFrontPort);
  public Spark RightBackMotor = new Spark(RobotMap.RightBackPort);
  public SpeedControllerGroup LeftMotors = new SpeedControllerGroup(LeftFrontMotor, LeftBackMotor);
  public SpeedControllerGroup RightMotors = new SpeedControllerGroup(RightFrontMotor, RightBackMotor);
  public DifferentialDrive drive = new DifferentialDrive(LeftMotors, RightMotors);

  public void teleopDrive(double move, double turn) {

    if(move > 0.5 ){
      move = 0.5;
    }
    drive.tankDrive(move, turn);
  } 

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
