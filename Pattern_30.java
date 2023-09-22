import java.io.*;
import java.util.*;

public class Pattern_30 {
    public static void main(String[] args) {
        // Question 30
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = n;

        for(int row=1;row<=n;row++){
            int count = n;
            // star
            for(int i=1;i<=star;i++){
                System.out.print(count+" ");
                count--;
            }

            System.out.println();
        }
    }
}