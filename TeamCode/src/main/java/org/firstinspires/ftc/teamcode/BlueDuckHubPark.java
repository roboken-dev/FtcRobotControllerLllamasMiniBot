package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "BLUEDuckHubPark@3", group = "18051")
public class BlueDuckHubPark extends LinearOpMode {

    LlamaBot robot = new LlamaBot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);

        waitForStart();
        ///19 points with storage unit - 26 points with warehouse

        robot.closeClaw(300);
        robot.armMoveToPosition(LlamaBot.ARM_POSITION_L3_DRIVE, this);
        robot.strafeRightByTime(robot.DRIVE_SPEED, 200);
//        robot.spin(true, 3800);
        robot.strafeLeftByTime(1/*robot.DRIVE_SPEED * 4*/, 3000);
        robot.driveForwardByTime(1/*robot.DRIVE_SPEED * 4*/, 1400);
        robot.armMoveToPosition(LlamaBot.ARM_POSITION_L3_DROP, this);
        robot.openClaw(300);
        robot.driveForwardByTime(-robot.DRIVE_SPEED, 100);
        if (true) {
            robot.strafeRightByTime(1/*robot.DRIVE_SPEED * 4*/, 3300);
        } else {
            robot.strafeRightByTime(robot.DRIVE_SPEED, 500);
            robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 4500);
        }
        robot.armMoveToPosition(LlamaBot.ARM_POSITION_FLOOR, this);
    }
}