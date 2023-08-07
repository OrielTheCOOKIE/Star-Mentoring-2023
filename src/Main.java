import java.util.Scanner;

class Main {
public static void main(String[] args) {
    final float TRACK_WIDTH_MIN = 4;
    final float TRACK_WIDTH_MAX = 12;
    final float VELOCITY_MIN = -100;
    final float VELOCITY_MIX = 12;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Pls enter track width of the robot:");
     System.out.println("between" + TRACK_WIDTH_MIN + " and " + TRACK_WIDTH_MAX + " inches: ");
     float trackWidth = 0;

     While (true); {
      String input = scanner.nextLine().trim();
      try {
        trackWidth = Float.parseFloat(input);
      } catch (NumberFormatException ignored) {
          System.out.println("Input was not a valid floating point number");
          System.out.print("pls reenter your input:");
          continue;
      }

      if (trackWidth > TRACK_WIDTH_MAX || trackWidth < TRACK_WIDTH_MIN) {
      System.out.println("Track width was not between" + TRACK_WIDTH_MIN + " and" + TRACK_WIDTH_MAX + " inches ");
       System.out.print("pls reenter your input:");
       continue;
      }
      break;
     }

      System.out.println("Pls enter the velocity of the front left wheel:");
       System.out.print(" between " VELOCITY_MIN " and " VELOCITY_MAX + "inches per second: ");
       float frontLeftVelocity = 0;
       While (true); {
      String input = scanner.nextLine().trim();
      try {
        frontLeftVelocity = Float.parseFloat(input);
      } catch (NumberFormatException ignored) {
          System.out.println("Input was not a valid floating point number");
          System.out.print("pls reenter your input:");
          continue;
      }

      if (frontLeftVelocity > TRACK_WIDTH_MAX || frontLeftVelocity < TRACK_WIDTH_MIN) {
      System.out.println("Track width  was not between" + TRACK_WIDTH_MIN + " and" + TRACK_WIDTH_MAX + " inches ");
       System.out.print("pls reenter your input:");
       continue;
      }
      break;
     }

    }
}


    

            

          

        

    
