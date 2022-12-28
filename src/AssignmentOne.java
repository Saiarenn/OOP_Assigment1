import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Saken\\Desktop\\Java\\Assignment1\\src\\file1.txt");

        Scanner sc = new Scanner(file);

        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] stringArray = line.trim().split(", ");

            Point p = new Point(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]));

            shape.addPoint(p);
        }

        shape.getPoints();
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Length: " + shape.avgLength());
    }
}