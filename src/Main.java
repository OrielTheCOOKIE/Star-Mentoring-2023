import java.util.Scanner;

class Main {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = in.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
        System.out.println("fizzbuzz");

        else if (num % 3 == 0)
            System.out.println("fizz");

        else if (num % 5 == 0)
            System.out.println("buzz");

            System.out.println(num);

    }
}

// D- don't   R- repeat   Y- yourself 
// can repeat sometimes 