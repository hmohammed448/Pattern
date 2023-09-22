import java.io.*;
import java.util.*;

public class Pattern_09
{
	public static void main(String[] args) {
	    // Question 09
		Scanner sc = new Scanner(System.in);
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
	}
}
