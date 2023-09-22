import java.io.*;
import java.util.*;

public class Pattern_08
{
	public static void main(String[] args) {
	    // Question 08
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j == i || j == n-i+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
	}
}
