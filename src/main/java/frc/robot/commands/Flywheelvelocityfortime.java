package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.flywheel.Flywheel;

public class Flywheelvelocityfortime extends Command{
    private Flywheel flywheel;
    private double time;
    private double velocity;
    private Timer timer;
    private double tolerance;

    public Flywheelvelocityfortime (Flywheel flywheel,double time,double velocity,double tolerance){     
        this.flywheel=flywheel;
        this.time =time;
        this.velocity=velocity;
        this.tolerance= tolerance;
    }

    @Override
    public void initialize() {
        timwe.start();
    }

    @Override
    public void execute() {
        flywheel.setVelocity(velocity);
        if(Math.abs(flywheel.getVelocity()-velocity)<tolerance){
            timer.reset();
        }

    }
    
    @Override
    public boolean isFinished() {
        return 	timer.hasElapsed(time);
    }
    

}
