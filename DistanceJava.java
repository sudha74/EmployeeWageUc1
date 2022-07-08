import java.util.Scanner;

public class DistanceJava {
    public static void main(String[] args) {

        // create scanner class object
        // to read input value
        Scanner scan = new Scanner(System.in);

        // declare variables
        int x1, x2, y1, y2, x, y;
        double distance;

        // read points coordinates
        System.out.println("Enter first point coordinates: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Enter second point coordinates: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();

        // calculate the distance between them
        x = x2 - x1;
        y = y2 - y1;
        distance =  Math.sqrt(x*x + y*y);


        // diplay result
        System.out.println("Distance between them = " + distance);
    }
    }

