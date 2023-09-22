import java.io.*;
import java.util.*;

public class Pattern_18{
    public static void main(String[] args) {
        // Question 18
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int star = 1;
        int space = n/2;
        for(int row=1;row<=n;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }

            // 2nd Half
            // star
            for(int i=1;i<star;i++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }

            if(row<=n/2){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }


    }
}