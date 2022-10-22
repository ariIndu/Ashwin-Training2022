// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */

  private CANSparkMax lclimberMotor;
  private CANSparkMax rclimberMotor;
  private RelativeEncoder lclimberEncoder;
  private RelativeEncoder rclimberEncoder;

  public Climber() {
    lclimberMotor = new CANSparkMax(0, MotorType.kBrushless);
    rclimberMotor = new CANSparkMax(0, MotorType.kBrushless);
    lclimberEncoder = lclimberMotor.getEncoder();
    rclimberEncoder = rclimberMotor.getEncoder();
  }

  public void climberUp() {
    lclimberMotor.set(-1.0);
    rclimberMotor.set(1.0);
  }

  public void climberDown() {
    lclimberMotor.set(1.0);
    rclimberMotor.set(-1.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
