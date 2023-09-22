import java.io.*;
import java.util.*;

public class Pattern_22{
    public static void main(String[] args) {
        // Question 2
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = n;
        int space = -1;

        for(int row=1;row<=n;row++){
            // star
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int j=1;j<=star;j++){
                if(j == n){
                    continue;
                }else{
                    System.out.print("*\t");
                }
            }
            space+=2;
            star--;
            System.out.println();
        }
    }
}