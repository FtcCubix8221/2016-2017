package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name = "Basic BasicAuto", group = "Red")
public class BasicAuto extends OpMode{

    DcMotor leftDrive;
    DcMotor rightDrive;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("left");
        rightDrive = hardwareMap.dcMotor.get("right");

    }

    @Override
    public void loop() {

        leftDrive.setPower(1);
        rightDrive.setPower(1);

    }

}
