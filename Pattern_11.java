import java.io.*;
import java.util.*;

public class Pattern_11
{
	public static void main(String[] args) {
	    // Question 11
		Scanner sc = new Scanner(System.in);
		int rows = 5;
		for (int i = 0; i <= rows; i++) {
            // Print spaces
            for (int j = 0; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
	}
}
