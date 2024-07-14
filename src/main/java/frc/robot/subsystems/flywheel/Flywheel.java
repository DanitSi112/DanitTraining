package frc.robot.subsystems.flywheel;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkBase.ControlType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheel extends SubsystemBase{
    
    private CANSparkFlex motor;
    public Flywheel(CANSparkFlex motor){
        this.motor= motor;
        
    }

    public void setPower(double power){
        motor.set(power);
    }

    public void setVelocity(double velocity){
        motor.getPIDController().setReference(velocity, ControlType.kVelocity);
    }



}
