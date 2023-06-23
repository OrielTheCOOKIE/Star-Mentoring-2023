import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the track width of the robot (inches): ");
        float trackWidth = scanner.nextFloat();

        System.out.print("Please enter the velocity of the front Left Wheel (Inches per seconds): ");
        float frontLeftVelocity = scanner.nextFloat();

         System.out.print("Please enter the velocity of the front Right Wheel (Inches per seconds): ");
        float frontRightVelocity = scanner.nextFloat();

         System.out.print("Please enter the velocity of the Back Left Wheel (Inches per seconds): ");
        float BackLeftVelocity = scanner.nextFloat();

         System.out.print("Please enter the velocity of the Back Right Wheel (Inches per seconds): ");
        float BackRightVelocity = scanner.nextFloat();

        float angularVelocityRadians = (BackRightVelocity + frontRightVelocity - frontLeftVelocity - BackLeftVelocity) /
                                        (4 * trackWidth);

        float angularVelocityDegrees = (float) Math.toDegrees(angularVelocityRadians);

        System.out.println("The angular Velocity is" + angularVelocityDegrees + "degrees per second");

        scanner.close();

    }
}