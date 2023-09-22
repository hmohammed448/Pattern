import java.io.*;
import java.util.*;

public class Pattern_15{
    public static void main(String[] args) {
        // Question 15
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int star = (n/2) + 1;
        int space = 0;
        for(int row=1;row<=n;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
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