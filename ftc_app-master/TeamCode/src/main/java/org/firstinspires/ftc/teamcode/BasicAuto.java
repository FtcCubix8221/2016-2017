package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;


@Autonomous(name = "Basic BasicAuto", group = "Red")
public class BasicAuto extends OpMode{

    DcMotor leftDrive;
    DcMotor rightDrive;

    TouchSensor touch;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("left");
        rightDrive = hardwareMap.dcMotor.get("right");

        touch = hardwareMap.touchSensor.get("touch");

    }

    @Override
    public void loop() {

        if(touch.isPressed()){
            leftDrive.setPower(-1);
            rightDrive.setPower(-1);
        }else{
            leftDrive.setPower(1);
            rightDrive.setPower(1);
        }


    }

}
