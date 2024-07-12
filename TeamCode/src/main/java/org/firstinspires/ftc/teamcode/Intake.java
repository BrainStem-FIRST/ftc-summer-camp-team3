package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

    public DcMotorEx intake;
    public Intake(HardwareMap hwMap){

        intake = hwMap.get(DcMotorEx.class, "IM");
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        intake.setDirection(DcMotor.Direction.FORWARD);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void Collect (){
        intake.setPower(0.8);


    }
    public void Dispense () {
        intake.setPower(-0.3);
    }

    public void Stop () {
        intake.setPower(0);
    }
}