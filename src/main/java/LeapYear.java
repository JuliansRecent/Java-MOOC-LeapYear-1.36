
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for a year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        // If the year is divisible by 100 AND 400, print "The year is a leap year."
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 4 == 0 && year % 100 !=0) {
            // If the year is divisible by 4 only, print "The year is a leap year."
            System.out.println("The year is a leap year.");
        } else {
            // If the year is not divisible by 4, print "The year is not a leap year."
            System.out.println("The year is not a leap year.");
        }
    }
}
