package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Lift {

    public DcMotorEx liftmotor;
    private ElapsedTime runtime = new ElapsedTime();

    public Lift(HardwareMap hwMap, Telemetry telemetry){

        liftmotor = hwMap.get(DcMotorEx.class, "LF");
        liftmotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        liftmotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        liftmotor.setDirection(DcMotor.Direction.FORWARD);
        liftmotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }

    public void Up(){

        liftmotor.setPower(0.5);
        liftmotor.setTargetPosition(1102);
        liftmotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        liftmotor.stop();

    }

    public void Down(){
        liftmotor.setPower(0.3);
        liftmotor.setTargetPosition(10);
        liftmotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void Stop(){
        liftmotor.setPower(0);
    }
}