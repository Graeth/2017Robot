package org.usfirst.frc.team3238.robot;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Chassis chassis;
    Joystick joystick;
    CANTalon driveLeftTalonA, driveLeftTalonB, driveRightTalonA, driveRightTalonB;
    
    @Override
    public void robotInit() {
        driveLeftTalonA = new CANTalon(1);
        driveLeftTalonB = new CANTalon(2);
        driveRightTalonA = new CANTalon(3);
        driveRightTalonB = new CANTalon(4);
        joystick = new Joystick(1);
        chassis = new Chassis(driveLeftTalonA, driveLeftTalonB, driveRightTalonA, driveRightTalonB, joystick);
    }

    @Override
    public void disabledPeriodic() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
    chassis.run();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {

    }
}

