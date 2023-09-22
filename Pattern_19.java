import java.io.*;
import java.util.*;

public class Pattern_19{
    public static void main(String[] args) {
        // Question 19
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int star = n/2 + 1;
        int space = -1;

        for(int row=1;row<=n;row++){
            int count = n;
            // star
            for(int i=1;i<=star;i++){
                System.out.print("* ");
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print("  ");
            }
            // star
            for(int i=1;i<=star;i++){
                if(row==1 && i==star) continue;
                if(row==n && i==star) continue;
                System.out.print("* ");
            }
            if(row<=n/2){
                space+=2;
                star--;
            }else{
                space-=2;
                star++;
            }
            System.out.println();
        }
    }
}