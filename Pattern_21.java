import java.io.*;
import java.util.*;

public class Pattern_21{
    public static void main(String[] args) {
        // Question 21
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = 1;
        int space = n-1;

        for(int row=1;row<=n;row++){
            // star
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<=space*2-1;i++){
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
            space--;
            star++;
            System.out.println();
        }
    }
}