import java.io.*;
import java.util.*;

public class Pattern_23 {
    public static void main(String[] args) {
        // Question 23
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = 1;
        int space = n-1;
        for (int row = 1; row <= n; row++) {
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // star
            for (int k = 1; k <= star; k++) {
                System.out.print("1\t");
            }
            space--;
            star+=2;

            System.out.println();
        }
    }
}
