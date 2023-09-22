import java.io.*;
import java.util.*;

public class Pattern_29 {
    public static void main(String[] args) {
        // Question 29
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = 1;
        int space = n-1;

        for (int row = 1; row <= n; row++) {
            int count = row;

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // star
            for (int i = 1; i <= star; i++) {
                if(i==1 || i==star)
                    System.out.print(count + "\t");
                else
                    System.out.print("0\t");
            }

            star+=2;
            space--;

            System.out.println();
        }
    }
}
