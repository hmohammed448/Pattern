import java.io.*;
import java.util.*;

public class Pattern_27 {
    public static void main(String[] args) {
        // Question 27
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = 1;
        int space = n-1;

        for (int row = 1; row <= n; row++) {
            int count = 1;

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // star
            for (int i = 1; i <= star; i++) {
                System.out.print(count + "\t");
                if(i<=star/2)
                    count++;
                else
                    count--;
            }

            star+=2;
            space--;

            System.out.println();
        }
    }
}
