import ftc.Motor;
import ftc.Sleep;

public class Main {
    public static void main(String[] args) {
        Motor lMotor = new Motor(1);
        Motor rMotor = new Motor(2);

        lMotor.setPower(0.5);
        rMotor.setPower(0.5);

        Sleep.forMilliseconds(3000);
        
        lMotor.setPower(0);
        rMotor.setPower(0);
}

}