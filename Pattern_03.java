import java.io.*;
import java.util.*;

public class Pattern_03
{
	public static void main(String[] args) {
	    // Question 03
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
