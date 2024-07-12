package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "RedAuto")
public class RedAuto extends LinearOpMode {

    private BrainSTEMRobot robot;

    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {

        robot = new BrainSTEMRobot(this.hardwareMap, this.telemetry, this);

        waitForStart();

        while (!opModeIsActive()){

            telemetry.addData("OpMode State :", "Init");
            telemetry.update();
        }

        robot.intake.Collect();


        runtime.reset();
        robot.setDTMotorPowers(0.72,0.2,0.2,0.72);
        while (runtime.seconds() < 0.4);
        robot.stop();


        runtime.reset();
        robot.setDTMotorPowers(0.7,0.7,0.7,0.7);
        while (runtime.seconds() < 0.3);
        robot.stop();


        runtime.reset();
        robot.setDTMotorPowers(-0.3,0.3,0.3,-0.3);
        while (runtime.seconds() < 0.3);
        robot.stop();


        /*runtime.reset();
        robot.setDTMotorPowers(-0.3,-0.3,-0.3,-0.3);
        while (runtime.seconds() < 0.1);
        robot.stop();


        runtime.reset();
        robot.setDTMotorPowers(-0.3,0.3,-0.3,0.3);
        while (runtime.seconds() < 0.5);
        robot.stop();


        runtime.reset();
        robot.setDTMotorPowers(0.45,0.45,0.45,0.45);
        while (runtime.seconds() < 1);
        robot.stop();*/





    }
}