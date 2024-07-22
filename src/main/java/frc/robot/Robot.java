// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

  
   private XboxController Ctrl = new XboxController(0);

   private Talon Jeffry = new Talon(1);
   private Talon Bob = new Talon(2); 
   private double Y_Pow;
   private final double MotorSpeed = 1.75;
  
  @Override
  public void robotInit() {

  Bob.setInverted(true);
  Jeffry.setInverted(false);

  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic(){
  
    if(Ctrl.getRawButton(6)) {
      Y_Pow = Ctrl.getLeftY();
    } else {
      Y_Pow = Ctrl.getLeftY() / MotorSpeed;
    }
  Bob.set(Y_Pow);
  Jeffry.set(Y_Pow);

  }

  

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
