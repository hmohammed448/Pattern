import java.io.*;
import java.util.*;

public class Pattern_06
{
	public static void main(String[] args) {
		// Question 06
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int space = 0;
		int star = n;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print("\t");
			}
			for(int j=0;j<star;j++){
				System.out.print("*\t");
			}
			space+=2;
			star--;
			System.out.println();
		}
	}
}
