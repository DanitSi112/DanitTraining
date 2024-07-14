package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;
import frc.robot.subsystems.flywheel.Flywheel;

public class FlywheelCommands {
    private Flywheel flywheel;

    public FlywheelCommands(Flywheel flywheel){
        this.flywheel=flywheel;
    } 

    public Command getSetPowerCommand(double power){
        return new FunctionalCommand(
            () -> {},
            () -> flywheel.setPower(power),
            (interrupted) -> flywheel.setPower(0),
            () -> false,
            flywheel
        );
    }

    public Command getSetVelocityCommand(double velocity){
        return new FunctionalCommand(
            ()->{},
            ()->flywheel.setVelocity(velocity),
            (interrupted)-> flywheel.setVelocity(0.),
            () -> velocity==flywheel.getVelocity(),
            flywheel
        );    
    }
}
