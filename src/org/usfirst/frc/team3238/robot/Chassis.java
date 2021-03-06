package org.usfirst.frc.team3238.robot;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * Created by BUTLEJEF000 on 1/16/2017.
 */
public class Chassis
{
    private RobotDrive driveTrain;
    
    private Joystick joy;
    
    Chassis(CANTalon leftTalonA, CANTalon leftTalonB, CANTalon rightTalonA,
            CANTalon rightTalonB, Joystick joy)
    {
        this.joy = joy;
        
        driveTrain = new RobotDrive(leftTalonA, leftTalonB, rightTalonA,
                rightTalonB);
    }
    
    public void run()
    {
        double y;
        if(Math.abs(joy.getY()) >= Constants.Chassis.DEADZONE)
        {
            y = joy.getY() * Constants.Chassis.MOVE_SCALE;
        } else
        {
            y = 0.0;
        }
        double twist;
        if(Math.abs(joy.getTwist()) >= Constants.Chassis.TWIST_DEADZONE)
        {
            twist = joy.getTwist() * Constants.Chassis.TWIST_SCALE;
        } else
        {
            twist = 0.0;
        }
        autoRun(y, twist);
    }
    
    public void autoRun(double y, double twist)
    {
        driveTrain.arcadeDrive(y, twist);
    }
}

