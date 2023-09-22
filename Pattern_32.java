import java.io.*;
import java.util.*;

public class Pattern_32{
    public static void main(String[] args) {
        // Question 32
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int col = 1;
        int star = -1;
        int count = 1;

        for(int row=1;row<=(n*2)-1;row++){
            // num row
            for(int i=1;i<=col*2-1;i++){
                if(i%2!=0) {
                    System.out.print(count + " ");
                }else{
                    System.out.print("* ");
                }
            }

            if(row<n){
                count++;
                col++;
                // star++;
            }else{
                count--;
                col--;
                // star--;
            }
            System.out.println();
        }
    }
}