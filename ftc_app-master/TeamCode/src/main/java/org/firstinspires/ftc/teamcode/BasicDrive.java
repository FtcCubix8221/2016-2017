package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Basic Drive")
public class BasicDrive extends OpMode{

    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left");
        rightMotor = hardwareMap.dcMotor.get("right");
    }

    @Override
    public void loop() {

        double left;
        double right;

        left = gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        leftMotor.setPower(left);
        rightMotor.setPower(right);

    }
}
