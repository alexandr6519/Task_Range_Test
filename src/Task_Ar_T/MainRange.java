package Task_Ar_T;

import java.util.Locale;
import java.util.Scanner;

public class MainRange {
           public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.print("Enter first point: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second point: ");
            double b = scanner.nextDouble();
            Range range = new Range(a, b);
            System.out.printf("The distance between points %.2f and %.2f is %.2f  ", a, b, range.getLength());
            System.out.println();

            System.out.println("Enter middle point: ");
            double c = scanner.nextDouble();
            double x = range.getX();
            double y = range.getY();

            if (range.isInside(c)) {
                System.out.printf("Point %.2f is between our points %.2f and %.2f", c, x, y);
                System.out.println();
            } else {
                System.out.printf("Point %.2f is OUTSIDE of line of points %.2f and %.2f", c, x, y);
                System.out.println();
            }
        }
    }

